package level2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialdemo {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/sakthi.txt"));
		Employee e = (Employee) ois.readObject();
		System.out.println(e.empno);
		System.out.println(e.ename);
		System.out.println(e.esal);
		ois.close();

	}

}
