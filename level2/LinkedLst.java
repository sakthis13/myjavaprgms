package level2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(11);
		li.add(11);
		li.add(51);
		li.add(61);
		li.add(11);
		li.add(null);
		li.add(9);
		li.add(null);
		System.out.println(li);
		li.addFirst(88);
		li.addLast(39);
		System.out.println(li);
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
	}

}
