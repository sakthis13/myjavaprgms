package level2;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class LocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Date d =new Date();
		System.out.println(d); // print date in ist
		
		
		// print in the long form 
		
		Locale l1 = new Locale ("en","IN");
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,l1);
		System.out.println(df.format(d));
		
		// print in shortform but in us format
		
		Locale l2= new Locale ("en","US");
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT,l2);
		System.out.println(df1.format(d));
		
		// print in short form in japan format
		Locale l3 = new Locale ("ja","JP");
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT,l3);
		System.out.println(df2.format(d));
		
				// print time 
					
		Locale l5 = new Locale ("en","IN");
		DateFormat df4 = DateFormat.getTimeInstance(DateFormat.LONG,l5);
		System.out.println(df4.format(d));
		
		Locale l6= new Locale ("en","US");
		DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT,l6);
		System.out.println(df5.format(d));
		
		
		Locale l4 = new Locale ("ja","JP");
		DateFormat df3 = DateFormat.getTimeInstance(DateFormat.SHORT,l4);
		System.out.println(df3.format(d));
	}

}
