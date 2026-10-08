package level2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt = 1836431.98;
		Locale l5 = new Locale ("en","IN");
		NumberFormat df4 = NumberFormat.getCurrencyInstance(l5);
		System.out.println(df4.format(amt));
		
		Locale l6= new Locale ("en","US");
		NumberFormat df5 = NumberFormat.getCurrencyInstance(l6);
		System.out.println(df5.format(amt));
		
		
		Locale l4 = new Locale ("ja","JP");
		NumberFormat df3 = NumberFormat. getCurrencyInstance(l4);
		System.out.println(df3.format(amt));
	}

}
