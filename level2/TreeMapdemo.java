package level2;
import java.util.TreeMap;

public class TreeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> m = new TreeMap<Integer,Integer>();
		m.put(1001, 88);
		m.put(1002, 99);
		m.put(1001, 10);
		m.put(1002, 20);
		m.put(1003, null);
		m.put(1004,null);
		System.out.println(m);

	}

}
