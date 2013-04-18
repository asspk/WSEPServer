import java.awt.*;
import java.awt.event.*;


public class GUI_UI extends Frame implements ClientUI, ActionListener {

	
	public GUI_UI()
	{
		setLayout(new FlowLayout());
		
		setTitle("Forum");
		setSize(1000,500);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String nextCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleMsg(String in) {
		// TODO Auto-generated method stub

	}

	@Override
	public String init_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logout_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signUp_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createForum_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createSubForum_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createMsg_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewsubforum_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewmessage_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createComment_request() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String back_request() {
		// TODO Auto-generated method stub
		return null;
	}



}
