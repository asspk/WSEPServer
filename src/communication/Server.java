package communication;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import data.ForumData;

public class Server {
	static ServerSocket serverSocket = null;
    static int port = 8002;
    
    
    public static void main(String[] args) throws IOException {
    	InetAddress host = InetAddress.getLocalHost();
    	System.out.println(host);
    	serverSocket = new ServerSocket(port);
    	ForumData forum = new ForumData();
    	
		while (true) {
            try {
              ConnectionHandler newConnection = new ConnectionHandler(serverSocket.accept(), new Protocol(forum));
              new Thread(newConnection).start();
            } catch (IOException e) {
            	e.printStackTrace();
            }
          }
    }
}
