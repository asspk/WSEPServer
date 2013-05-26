
public class Protocol {
	
	public static String init_request(String username, String pass)
	{
		return "Init "+username + " "+ pass;
	}
	
	public static String logIn_request(String username, String pass)
	{
		return "LogIn "+username + " "+ pass;
	}
	
	public static String logOut_request()
	{
		return "LogOut ";
	}
	
	public static String signUp_request(String username, String pass, String name, String age)
	{
		return "SignUp "+username + " "+ pass + " " + name + " "+ age;
	}
	
	public static String createSubForum_request(String name, String dec)
	{
		return "CreateSubForum "+name + " "+ dec;
	}
	
	public static String createMsg_request(String title, String content)
	{
		return "CreateMessage "+title + " "+ content;
	}
	
	public static String createComment_request(String content)
	{
		return "CreateComment "+ content;
	}
	
	public static String view_request()
	{
		return "ViewForum ";
	}
	
	public static String viewSubForum_request(String num)
	{
		return "ViewSubForum "+ num;
	}
	
	public static String viewMsg_request(String num)
	{
		return "ViewMessage "+ num;
	}
	
	public static String Back_requset()
	{
		return "Back ";
	}
	
	

}
