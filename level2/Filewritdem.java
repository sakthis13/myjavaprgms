package level2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Filewritdem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		File f1=new File("e:/demo.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		System.out.println("enter your data :");
		String data = scan.nextLine();
		byte[] b =data.getBytes();
		fos.write(b);
		System.out.println("successfully written");
		scan.close();
		

	}

}
