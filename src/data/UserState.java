package data;

public class UserState {
	private SubForum sub;
	private Message msg;
	
	public UserState() {
		sub = null;
		msg = null;
	}
	
	public SubForum getSubForum() {
		return this.sub;
	}
	
	public Message getMsg() {
		return this.msg;
	}
	
	public void changeSub(SubForum sub) {
		this.sub = sub;
		this.msg = null;
	}
	
	public void changeMsg(Message msg) {
		this.msg = msg;
	}

	public void toForum() {
		this.sub = null;
		this.msg = null;
	}
}
