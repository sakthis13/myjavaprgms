package level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("enter 2 numbers : ");
//			int a =scan.nextInt();
//			int b=scan.nextInt();
//			int c = a/b;
//			System.out.println("quotient value: ");
			//int arr [] = {1,2,3};
			//System.out.println("enter array index:");
//			int index=scan.nextInt();
//			System.out.println("vale"+arr[index]);
			System.out.println("Enter array size:");
			int size = scan.nextInt();
			int arr[] = new int[size];
			System.out.println("Array size accepted:");
			
		}
		
		catch (NegativeArraySizeException e) {
			System.out.println("Error : "+ e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : "+e.toString());
		}
		catch(ArithmeticException e){
			System.out.println("Error :" + e.toString());
			
		}
		catch (InputMismatchException e) {
			System.out.println("pls enter only number.");
		}
		scan.close();

	}

}
