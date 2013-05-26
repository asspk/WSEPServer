package data;
import java.util.Vector;


public class Message {
	private User authorUser;
	private String title;
	private String content;
	private Vector<Comment> comments;
	
	public Message(User authorUser, String title, String content) {
		this.setAuthorUser(authorUser);
		this.setTitle(title);
		this.setContent(content);
		this.comments = new Vector<Comment>();
	}
	
	public void addComment(Comment comment) {
		
		comments.add(comment);
	}
	
	public void DeleteComment(int id) {
		comments.remove(id); 
	}
	
	
	public User getAuthorUser() {
		return authorUser;
	}

	public void setAuthorUser(User authorUser) {
		this.authorUser = authorUser;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String display() {
		String output = "By: " + authorUser.getUserName() + "\nTitle: " +  this.getTitle() + "\nContent:" + this.getContent() + "\n";
		
		for (int i = 0; i < comments.size(); i++)
			output = output + "\t" + comments.elementAt(i).getAuthorUser().getUserName() + ": " + comments.elementAt(i).getContent() + "\n";
		
		return output;
	}
}
