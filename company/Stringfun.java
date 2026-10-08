package company;
import java.util.Scanner;

public class Stringfun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String a = s.next();
		String res = "";
		int len= a.length();
		for (int i =0;i<len/2;i++) {
			res += a.charAt(i);
			res+=a.charAt(len-1-i);
		}
		System.out.println(res);
		s.close();
	}

}
