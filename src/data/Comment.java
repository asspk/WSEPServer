package data;

public class Comment {
	private String content;
	private User authorUser;
		
	public Comment(User authorUser, String content) {
		this.setContent(content);
		this.setAuthorUser(authorUser);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthorUser() {
		return authorUser;
	}

	public void setAuthorUser(User authorUser) {
		this.authorUser = authorUser;
	}
}
