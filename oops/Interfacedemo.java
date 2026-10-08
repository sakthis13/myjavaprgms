package oops;
interface Dad
{
	 int a=10;
	void dis();
	
	}
interface Mom
{
	int b =20;
	void dis2();
}
public class Interfacedemo implements Dad,Mom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfacedemo ifd=new Interfacedemo();
		ifd.dis();
		ifd.dis2();

	}
	public void dis() {
		System.out.println("inter a " + a );
		System.out.println(b);
		
	}
	public void dis2() {
		System.out.println(a + b);
		
	}

}
