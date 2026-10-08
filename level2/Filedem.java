package level2;

import java.io.File;
import java.io.FileInputStream;

public class Filedem {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("E:/dem.txt");
		if (f1.exists())
		{
			long len = f1.length();
			System.out.println("available: "+len);
			FileInputStream fis=new FileInputStream(f1); 
			for (int i =0;i<len;i++)
			{
				System.out.print((char)fis.read());
			}
			fis.close();
		}
		else
		{
			System.out.println("not available");
		}
		

	}

}
