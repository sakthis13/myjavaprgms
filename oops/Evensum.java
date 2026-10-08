package oops;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {22, 43, 55, 65, 77, 100, 99, 31, 50};
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                sum = sum + arr[i];
	            }
	        }

	        System.out.println("Sum of even numbers = " + sum);

	}

}
