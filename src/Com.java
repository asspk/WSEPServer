import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Com {
	
	private static  Socket socket;
	private static  BufferedReader reader;
	private static  PrintWriter writer;
	
	public static void Conncect() throws UnknownHostException, IOException
	{
		socket = new Socket("132.72.45.17",8002);
		reader=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		writer=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"), true);

	}
	
	public static String recieveMessage() throws UnsupportedEncodingException, IOException
	{
		char[] input = new char [256];
		String msg="", curr="";
		System.out.println("before recieve loop");
//		while(reader.read(input,0,256) != -1 && !((curr = new String(input)).contains("EOM")))
//		{
//			msg += curr;
//			System.out.println("inside recieve loop"+ msg);
//		}
		System.out.println("blocked?");
		reader.read(input);
		System.out.println("not blocked!");
		curr = new String(input);
		msg += curr;
		
		
		return msg.substring(0,msg.length()-3);
	}
	
	public static void sendMessage(String msg) throws UnsupportedEncodingException, IOException
	{
		while(msg.length()>=253)
		{
			System.out.println("inside sending loop");
			writer.print(msg.substring(0, 255));
			System.out.println(msg.substring(0, 255));
			System.out.println(msg.substring(256));
			msg=msg.substring(256);
		}
		System.out.println("msg: "+msg+"EOM");
		writer.print(msg+"EOM");
	}
	

}
