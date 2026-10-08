package company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,22,33,44,55};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to be inserted: " );
		int a = scan.nextInt();
		System.out.println("Enter array index:");
		int b = scan.nextInt();
		for(int i = 0;i < arr.length ; i++ )
		{
			if (i==b) {
				arr[i]=a;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
