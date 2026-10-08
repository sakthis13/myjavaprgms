package client;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Type your message to send to server: ");
		String txt = scan.nextLine();
		try{
			Socket s=new Socket("localhost",8765);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(txt);
			System.out.println("Successfully sent data to server ");
			s.close();

		
		}
		catch (Exception e)
		{
			System.out.println("Error Name: "+e.toString());

		}
	

		scan.close();
}	


}