package data;
import java.util.Vector;


public class SubForum {
	private String name;
	private Vector<Message> messages;
	private User admin;
	
	public SubForum(String name, User admin) {
		this.name = name;
		this.messages = new Vector<Message>();
		this.admin = admin;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String display() {
		String content = name + ":\n";
		
		for (int i = 0; i < this.messages.size(); i++)
			content =  content + "\t" + i + ") "+ this.messages.elementAt(i).getTitle() + "\n";

		return content;
	}
	
	public User getAdmin() {
		return admin;
	}
	
	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public Message getMsg(int id) {
		if (0 <= id && id < this.messages.size())
			return this.messages.elementAt(id);
		return null;
	}

	public void addMsg(Message msg) {
		this.messages.add(msg);
	}
}
