package data;

public class ForumData {
	private Forum forum;
	
	public ForumData() {
		this.forum = new Forum();
	}
	
	public String viewSubForum(User usr, int id) {
		SubForum sub = this.forum.getSubForum(id);
		if (sub != null) {
			usr.getState().changeSub(sub);
			return sub.display(); 
		}
		return "Error: Number entered is not a valid subforum id.";
	}
	
	public String viewMessage(User usr, int id) {
		if(usr.getState().getSubForum() != null) {
			Message msg = usr.getState().getSubForum().getMsg(id);
			if (msg != null) {
				usr.getState().changeMsg(msg);
				return usr.getState().getMsg().display();
			} else
				return "Error: Invalid message id number.";
		} else
			return "Error: Please enter a sub-forum first.";
	}

	public String viewForum(User usr) {
		usr.getState().toForum();
		return this.forum.display();
	}

	public User login(String userName, String pass) {
		return this.forum.login(userName, pass);
	}

	public String createSubForum(User usr, String name, String desc) {
		if(usr != null && usr.getUserName().equals(this.forum.getAdmin().getUserName())) {
			this.forum.addSubforum(new SubForum(name, usr));
			return "Sub Forum: " + name + " with description: " + desc + "\n\n\tCreated Succesfully.\n";
		} else
			return "Error: Permission denied. You are not an admin. You cannot create a subforum.\n";
	}

	public String createMessage(User usr, String title, String content) {
		if (usr.getState().getSubForum() == null)
			return "Error: Cannot post a message while not viewing a subforum.";
		if (usr.getState().getSubForum() == null)
			return "Error: Cannot post a message as a guest.";
		
		Message msg = new Message(usr, title, content);
		usr.getState().getSubForum().addMsg(msg);
		usr.getState().changeMsg(msg);
		return usr.getState().getSubForum().display();
	}

	public User signup(String userName, String pass) {
		if (this.forum.userExists(userName) == null) {
			User nUser = new User(userName, pass);
			this.forum.addForumUser(nUser);
			return nUser;
		}
		return null;
	}

	public String back(User usr) {
		if (usr.getState().getMsg() != null) {
			usr.getState().changeMsg(null);
			return usr.getState().getSubForum().display();
		} else if (usr.getState().getSubForum() != null) {
			usr.getState().changeSub(null);
			return this.forum.display();
		}
		return "";
	}

	public String init(String forumName, User admin) {
		this.forum.setName(forumName);
		this.forum.addForumUser(admin);
		this.forum.setAdmin(admin);

		return "Forum created. Admin: " + admin.getUserName();
	}

	public String createComment(User usr, String content) {
		if (usr == null)
			return "Error: Cannot post a message as a guest.";
		if (usr.getState().getMsg() == null)
			return "Erorr: Cannot post a comment while not viewing a message.";
		
		Comment cmt = new Comment(usr, content);
		usr.getState().getMsg().addComment(cmt);

		return usr.getState().getMsg().display();
	}
}
