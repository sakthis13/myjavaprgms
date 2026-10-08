package oops;
 abstract class Absclass{
	 int a;
	 int b=100;
	 protected int c = 10;
	 private int d = 20;
	 
	 abstract void dis1();
	 void dis2()
	 
	 {
		 a=100;
		 System.out.println("complete method");
	 }
	 
 }
public class Aclass extends Absclass {

	public static void main(String[] args) {
		Aclass ac=new Aclass();
		ac.dis1();
		ac.dis2();

	}

	@Override
	void dis1() {
		// TODO Auto-generated method stub
		System.out.println("override complete ");
		System.out.println(b);
		
	}

}
