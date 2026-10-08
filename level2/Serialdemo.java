package level2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int empno;
	String ename;
	float esal;
	public Employee(int empno, String ename, float esal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.esal = esal;
	}
	
}

public class Serialdemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Employee e =new Employee(1002,"sakthi",10002.03f);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/sakthi.txt"));
		oos.writeObject(e);
		System.out.println("data written successfully.");
		
		

	}

}
