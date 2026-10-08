package level2;
class Emp
{
	int eno;
	String ename;
	float sal;
	boolean iseligible;
	Emp(int eno,String ename,float sal,boolean iseligible)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.iseligible=iseligible;
	}
	
}
class Student<T>
{
	void dis (T var)
	{
		System.out.println(var);
	}
	void dis1(T var)
	{
		Emp k = (Emp) var;
		System.out.println(k.eno);
		System.out.println(k.ename);
		System.out.println(k.sal);
		System.out.println(k.iseligible);
	}
}

public class Gclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String> s1=new Student<String>();
		s1.dis("Sakthi");
		Student<Integer> s2=new Student<Integer>();
		s2.dis(100);
		Student<Float>s3=new Student<Float>();
		s3.dis(100.87f);
		// how to pass object in generic class
		Emp e = new Emp(1001,"sakthi",29910.f,true);
		Student<Emp> s4=new Student<Emp>();
		s4.dis(e);
		s4.dis1(e);

	}

}
