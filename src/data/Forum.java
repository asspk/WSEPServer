package data;
import java.util.Vector;


public class Forum {
	private String name;
	private Vector<SubForum> subForums;
	private Vector<User> forumUsers;
	private User admin;

	public Forum() {
		this.subForums = new Vector<SubForum>();
		this.forumUsers = new Vector<User>();
		this.name = null;
		this.admin = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public void addForumUser(User user) {
		this.forumUsers.add(user);
	}

	public User userExists(String userName) {
		for(int i = 0; i < this.forumUsers.size(); i++) {
			if (this.forumUsers.elementAt(i).getUserName().equals(userName))
				return this.forumUsers.elementAt(i);
		}
		return null;
	}

	public SubForum getSubForum(int id) {
		if (0 <= id && id < subForums.size())
			return this.subForums.elementAt(id);
		return null;
	}


	public String display() {
		String content = name + ":\n";

		for (int i = 0; i < subForums.size(); i++)
			content =  content + "\t" + i + ") "+ subForums.elementAt(i).getName() + "\n";


		return content;
	}

	public User login(String userName, String pass) {
		User usr;
		for (int i = 0; i < this.forumUsers.size(); i++) {
			usr = this.forumUsers.elementAt(i);
			if (usr.getUserName().equals(userName) && usr.getPassword().equals(pass))
				return usr;
		}
		return null;
	}

	public void addSubforum(SubForum subForum) {
		this.subForums.add(subForum);
	}


}
