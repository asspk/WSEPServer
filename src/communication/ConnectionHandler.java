package communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ConnectionHandler implements Runnable {
	private BufferedReader in;
    private PrintWriter out;
    Socket clientSocket;
    Protocol protocol;

    public ConnectionHandler(Socket acceptedSocket, Protocol p) {
      in = null;
      out = null;
      clientSocket = acceptedSocket;
      protocol = p;
    }

    private void initialize() {
        // Initialize I/O
        try {
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
			out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(),"UTF-8"), true);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not intialize io buffers.");
			e.printStackTrace();
		}
        
    }
    
	public void run() {
		try {
			initialize();
			System.out.println("connection initialized");
			sendMessage("Server says: Connected!");
			while (true) {	
				String msg, response;
				msg = recieveMessage().trim();
				System.out.println("msg recieved: " + msg);
				if (!msg.equals("")) {
					response = protocol.processMessage(msg);
					System.out.println("response sent: " + response);
					sendMessage(response);
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		close();
	}

	public void close() {
        try {
          if (in != null) {
            in.close();
          }
          if (out != null) {
            out.close();
          }
          clientSocket.close();
        } catch (IOException e) {
          System.out.println("Exception in closing I/O");
        }
      }

	public String recieveMessage() throws UnsupportedEncodingException, IOException {
		char c[] = new char[1];
		String msg = "";
		
		while (!msg.contains("EOM")) {
			in.read(c, 0, 1);
			msg += c[0];
		}
		
		return msg.substring(0, msg.length()-3);
	}

	public void sendMessage(String msg) throws UnsupportedEncodingException, IOException
	{
		out.print(msg+"EOM");
		out.flush();
	}
}
