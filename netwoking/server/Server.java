package server;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server{
	public static void main(String[] args){
		System.out.println("waiting server.....................");
		try{		

			ServerSocket ss=new ServerSocket(8765);
			Socket s = ss.accept();//establish connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String cdata=dis.readUTF();
			System.out.println("client data : "+cdata);
			s.close();
			ss.close();
			
}	
		catch (Exception e){
			System.out.println("Error Name: "+e.toString());
}
}
}