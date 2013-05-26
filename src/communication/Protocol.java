package communication;

import data.ForumData;
import data.User;


public class Protocol {

	private User currUser;
	private ForumData forum;

	public Protocol(ForumData f) {
		forum = f;
	}

	public String processMessage(String strReq) {
		String whatToDo = "";

		String returnString = "";

		for(int i = 0; i < strReq.length() && strReq.charAt(i) != ' '; i++) 
			whatToDo = whatToDo + strReq.charAt(i);	//Get the command	

		String restToDo = strReq.substring(whatToDo.length()).trim();
		if(whatToDo.equals("ViewSubForum"))
			returnString = handleViewSubForum(restToDo);
		else if(whatToDo.equals("ViewMessage"))
			returnString = handleViewMessage(restToDo);
		else if(whatToDo.equals("ViewForum"))
			returnString = handleViewForum();	
		else if(whatToDo.equals("LogIn"))
			returnString = handleLogIn(restToDo);
		else if(whatToDo.equals("LogOut"))
			returnString = handleLogOut();
		else if(whatToDo.equals("CreateSubForum"))
			returnString = createSubForum(restToDo);
		else if(whatToDo.equals("CreateMessage"))
			returnString = createMessage(restToDo);
		else if(whatToDo.equals("SignUp"))
			returnString = handleSignUp(restToDo);
		else if(whatToDo.equals("Back"))
			returnString = handleBack();
		else if(whatToDo.equals("Init"))
			returnString = handleInit(restToDo);			
		else if(whatToDo.equals("CreateComment"))
			returnString = createComment(restToDo);
		else
			returnString = "Unable to process request.\n";

		return returnString;
	}

	private String createComment(String restToDo) {
		String content = restToDo.trim();
		return this.forum.createComment(currUser, content);
	}

	private String createMessage(String restToDo) {
		String title = restToDo.substring(0, restToDo.indexOf(' '));
		String content = restToDo.substring(restToDo.indexOf(' ')+1);
		
		return this.forum.createMessage(currUser, title, content);
	}

	private String handleInit(String strReq) {
		String userName = "";
		String password = "";
		int i;
		for(i = 0; i < strReq.length() && strReq.charAt(i) != ' '; i++)
			userName = userName + strReq.charAt(i);

		i++;
		for(; i<strReq.length(); i++)
			password = password + strReq.charAt(i);

		this.currUser = new User(userName, password);
		return this.forum.init("Shemer Forum", this.currUser);
	}

	private String handleBack() {
		return this.forum.back(this.currUser);
	}

	private String handleViewForum() {
		return forum.viewForum(currUser);
	}

	private String handleSignUp(String strReq) {
		String userName = "";
		String password = "";
		int i;
		for(i = 0; i < strReq.length() && strReq.charAt(i) != ' '; i++)
			userName = userName + strReq.charAt(i);

		i++;
		for(; i<strReq.length() && strReq.charAt(i) != ' '; i++)
			password = password + strReq.charAt(i);

		User nUser = this.forum.signup(userName, password);
		if (nUser == null) {
			return "Username already exists.";
		} else {
			this.currUser = nUser;
			return "Signup successful. \nUsername: " + userName + "\n"+ this.forum.viewForum(nUser);
		}
	}

	public User getCurrUser() {
		return currUser;
	}

	private String handleLogOut() {
		if(currUser != null) {
			User tUsr = this.currUser;
			this.currUser = null;
			return "Logged out from: " + tUsr.getUserName(); 
		} else
			return "Not logged on.";
	}

	private String handleLogIn(String strReq) {
		String userName = "";
		String password = "";
		User forumUser = null;
		int i;

		if (this.currUser != null)
			return "Already logged in";

		for(i = 0; i < strReq.length() && strReq.charAt(i) != ' '; i++)
			userName = userName + strReq.charAt(i);

		i++;
		for(; i<strReq.length(); i++)
			password = password + strReq.charAt(i);

		forumUser = this.forum.login(userName, password);

		if(forumUser == null)
			return "Invalid user name or password.";
		else {
			this.currUser = forumUser;
			return "Successfully connected as: " + userName + "\n";
		}
	}

	private String handleViewMessage(String strReq) {
		int id = Integer.parseInt(strReq);
		return this.forum.viewMessage(currUser, id);
	}

	private String handleViewSubForum(String strReq) {
		int id = Integer.parseInt(strReq);
		return this.forum.viewSubForum(currUser, id);
	}

	public String createSubForum(String strReq) {
		String name = "";
		String description = "";
		int i;
		for(i = 0; i < strReq.length() && strReq.charAt(i) != ' '; i++)
			name = name + strReq.charAt(i);

		i++;
		for(; i<strReq.length(); i++)
			description = description + strReq.charAt(i);	

		return this.forum.createSubForum(currUser, name , description);
	}
}