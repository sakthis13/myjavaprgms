package level2;

import java.util.Hashtable;


public class Hashtabledem {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Integer> m = new Hashtable<Integer,Integer>();
		m.put(1001, 88);
		m.put(1002, 99);
		m.put(1001, 10);
		m.put(1002, 20);
		m.put(1003, 22);
		m.put(1004,33);
		System.out.println(m);

	}

}
