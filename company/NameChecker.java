package company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NameChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		System.out.println("enter the input : ");
		String input = scan.next();
		Matcher m = p.matcher(input);
		if (m.matches()==true)
		{
			System.out.println("valid format");
			
		}
		else
		{
			System.out.println("invalid format.");
		}
		
		scan.close();

	}

}
