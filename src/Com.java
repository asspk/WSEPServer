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
		socket = new Socket("132.72.45.190",8002);
		reader=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		writer=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"), true);

	}
	public static String recieveMessage() throws UnsupportedEncodingException, IOException {
		char c[] = new char[1];
		String msg = "";
		while (!msg.contains("EOM")) {
			reader.read(c, 0, 1);
			msg=msg+c[0];
			
		}
		
		return msg.substring(0, msg.length()-3);
	}
	
	public static void sendMessage(String msg) throws UnsupportedEncodingException, IOException
	{
		writer.println(msg+"EOM");
		writer.flush();
	}
	

}
