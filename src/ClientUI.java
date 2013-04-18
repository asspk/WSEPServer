
public interface ClientUI {
	public String nextCommand();
	public void handleMsg(String in);
	public String init_request();
	public String login_request();
	public String logout_request();
	public String signUp_request();
	public String createForum_request();
	public String createSubForum_request();
	public String createMsg_request();
	public String view_request();
	public String viewsubforum_request();
	public String viewmessage_request();
	public String createComment_request();
	public String back_request();
}
