package level2;
class Parent
{
	void show()
	{
		System.out.println("this is parent class");
	}
}
class Child extends Parent {
	void show () {
		System.out.println("this is child class");
	}
}

public class ObjCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child ();
		p.show();
		Child c =(Child)p;
		c.show();
		
	}

}
