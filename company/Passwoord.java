package company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Passwoord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile("");
		System.out.println("enter the password : ");
		String input = scan.next();
		int cls=0,slc=0,scc=0,dc=0,len=0;
		len =input.length();
		char[] c= input.toCharArray();
		Pattern p1 = Pattern.compile("[A-Z]+");
		Pattern p2 = Pattern.compile("[a-z]");
		Pattern p4 = Pattern.compile("[0-9]");
		Pattern p3 = Pattern.compile("[^A-Za-z0-9]");
		Matcher m;
		for(int i =0;i<len;i++)
		{
			
		String ch = c[i]+"";
		m = p1.matcher(ch);
		if (m.matches())
			cls++;
		m = p2.matcher(ch);
		if (m.matches())
			slc++;
		m = p3.matcher(ch);
		if (m.matches())
			scc++;
		m = p4.matcher(ch);
		if (m.matches())
			dc++;
		}
		
		//System.out.println(cls+" "+slc+" "+scc+" "+dc+" "+len);
		if(cls>0 && slc>0 && scc>0 && dc>0 && (len>=8 && len<=12))
		{
			System.out.println("valid");
			
		}
		else
		{
			System.out.println("invalid");
		}
		scan.close();
		
	}

}
