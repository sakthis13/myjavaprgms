package level2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]+");  //"[A-Z]{1}[a-z]+"  //("[a-z]*")  // ("[a-z]+")  //("^[a-z A-Z ]{3,}") // (" [a-z A-Z]{3,}") // ("[a-z]{3,}")//("[A-Z]{3,12}")     //Pattern p = Pattern.compile("[0-9]{10}"); //Pattern p = Pattern.compile("..at");
		System.out.println("enter the input : ");
		String input =scan.next();
		Matcher m = p.matcher(input);
		if (m.matches()==true)
		{
			System.out.println("valid format");
			
		}
		else
		{
			System.out.println("invalid format.");
		}
		

	}

}
