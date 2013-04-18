import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
public class ClientLogic {

	private static ClientUI ui=new Cmd_UI();
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		String command="", outcome="", currLine="init";
		Com.Conncect();
		outcome=Com.recieveMessage();
		System.out.println("Msg recieved from server: "+outcome +"\n");
		ui.handleMsg(outcome);
		for(;;)
		{
			
			if(!command.equals("Logout"))
			{
				System.out.println("sending MSG: "+command +"\n");
				Com.sendMessage(command);
				outcome="";
				currLine="init";
//				while(currLine!=null && currLine!="")
//				{
//					currLine=Com.recieveMessage();
//					System.out.println("currr: " + currLine);
//					outcome=outcome + currLine;
//					currLine=Com.recieveMessage();
//				}
				System.out.println("before recieving");
				outcome=Com.recieveMessage();
				System.out.println("Msg recieved from server: "+outcome +"\n");
				ui.handleMsg(outcome);
			}
			else
			{
				break;
			}
			
			command = ui.nextCommand();
		}
	}
	

	
	
	

}
