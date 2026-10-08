package level2;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
		m.put(1001, 88);
		m.put(1002, 99);
		m.put(1001, 10);
		m.put(1002, 20);
		m.put(null, 100);
		m.put(1003, null);
		m.put(null, null);
		m.put(1004,null);
		System.out.println(m);

	}

}
