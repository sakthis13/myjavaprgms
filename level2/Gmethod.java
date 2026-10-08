package level2;

public class Gmethod {

	<T> void display(T a,T b)
	{
		System.out.println(a+" "+b);
	}
	<T> void dis1(T v)
	{
		Emp a = (Emp)v;
		System.out.println(a.eno+ " "+a.ename+" "+a.sal+" "+a.iseligible);
		System.out.println(((Emp)v).eno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmethod gm = new Gmethod();
		gm.display(101, "sakthi");
		gm.display("tamil", 102);
		gm.display("sakthi","pudukkottai");
		gm.display(102.4f, "c");
		
		Emp e1=new Emp(1002,"Sakthi",15000.20f,false);
		gm.dis1(e1);
	}

}
