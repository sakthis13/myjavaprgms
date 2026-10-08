package oops;

public class Seclarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {22, 44, 55, 66, 77, 100, 99, 34, 56};

	        int largest = arr[0];
	        int secondLargest = arr[0];

	        for (int i = 1; i < arr.length; i++) {

	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } 
	            else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Second largest number = " + secondLargest);

	}

}
