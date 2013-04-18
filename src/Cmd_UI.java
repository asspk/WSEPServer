import java.util.Scanner;


public class Cmd_UI implements ClientUI {
	
	private String menu="what request would you like? \n" +
			"enter the number of the option:\n" +
			"press 1 for initilize forum \n" +
			"press 2 for login \n" +
			"press 3 for logout \n" +
			"press 4 for sign up \n" +
			"press 5 for create forum (super user only) \n" +
			"press 6 for create sub-forum  \n" +
			"press 7 for create message \n" +
			"press 8 for view all the sub forums \n" +
			"press 9 for view specific sub forum \n" +
			"press 10 for view specific message \n";
	
	private Scanner in= new Scanner(System.in);
	
	private boolean status;
	
	@Override
	public String nextCommand() {
		String command="";
		String result = "";
		
		System.out.println(menu);
		command=in.next();
		
		int option=Integer.parseInt(command);
		switch(option)
		{
		case 1:
			result=init_request();
			break;
		case 2:
			result=login_request();
			break;
		case 3:
			result=logout_request();
			break;
		case 4:
			result=signUp_request();
			break;
		case 5:
			result=createForum_request();
			break;
		case 6:
			result=createSubForum_request();
			break;
		case 7:
			result=createMsg_request();
			break;
		case 8:
			result=view_request();
			break;
		case 9:
			result=viewsubforum_request();
			break;
		case 10:
			result=viewmessage_request();
			break;
		case 11:
			result="sssssssssssss";
			break;
		}
		
		return result;
	}
	
	

	@Override
	public void handleMsg(String in) {
		System.out.println(in);
	}
	
	
	@Override
	public String init_request() {
		String result="";
		System.out.println("Enter username and password: \n");
		String username=in.next();
		String password=in.next();
		
		result="Init "+username+" "+password;
		return result;
	}

	@Override
	public String login_request() {
		String result="";
		System.out.println("Enter username and password: \n");
		String username=in.next();
		String password=in.next();
		
		result="LogIn "+username+" "+password;
		return result;
	}

	@Override
	public String logout_request() {
		String result="";
		System.out.println("Thank you! bye \n");
		result="LogOut ";
		return result;
	}

	@Override
	public String signUp_request() {
		String result="";
		System.out.println("Enter username, password, name, age \n");
		String username=in.next();
		String password=in.next();
		String name=in.next();
		String age=in.next();
		result="SignUp "+username+" "+password+" "+ name+ " "+ age;
		return result;
	}

	@Override
	public String createForum_request() {
		String result="";
		System.out.println("Enter name and description \n");
		String name=in.next();
		String des=in.next();
		result="CreateForum "+name+" "+des;
		return result;
	}
	
	@Override
	public String createSubForum_request() {
		String result="";
		System.out.println("Enter sub forum name and description \n");
		String name=in.next();
		String des=in.next();
		result="CreateSubForum "+name+" "+des;
		return result;
	}
	
	@Override
	public String createMsg_request() {
		String result="";
		System.out.println("Enter sub forum id and content \n");
		String forumId=in.next();
		String des=in.next();
		result="CreateMessage "+forumId+" "+des;
		return result;
	}
	@Override
	public String createComment_request() {
		String result="";
		System.out.println("Enter content \n");
		String content=in.next();
		result="CreateComment "+content;
		return result;
	}
	@Override
	public String view_request() {
		String result="View ";
		return result;
	}

	@Override
	public String viewsubforum_request() {
		String result="";
		System.out.println("Enter sub forum number \n");
		String subForumNum=in.next();
		result="ViewSubForum "+subForumNum;
		return result;
	}

	@Override
	public String viewmessage_request() {
		String result="";
		System.out.println("Enter message number \n");
		String messageNum=in.next();
		result="ViewMessage "+messageNum;
		return result;
	}


	@Override
	public String back_request() {
		String result="Back ";
		return result;
		
	}



}
