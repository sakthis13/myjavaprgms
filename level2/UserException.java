package level2;

import java.util.Scanner;

public class UserException {
	Scanner scan = new Scanner(System.in);
	public UserException(){
	System.out.println("Enter Mark:");
	int mark = scan.nextInt();
	if (mark>=0 && mark<=100)
	{
		System.out.println("valid mark");
	}
	else {
		try {
			throw new Exception ("pla enter mark within 0 to 100 .");
			
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		new UserException();
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new UserException();
		
			
		}
	

	}

