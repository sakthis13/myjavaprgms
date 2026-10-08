package company;

public class Arrprime {

	public static void main(String[] args) {
		int arr[]= {10,13,2,3,8,6,15,111,119,23,43,12,34,3547,6768787,45,434,6576,35,46546,6576,68797,545,35454,7687,879,848,4,8,48,489,45,689};
		int len = arr.length;
		for(int i =0;i<len;i++)
		{
			int zc =0;
			int n = arr[i];
			for (int j=2;j<n;j++)
			{
				if (n%j==0)
				{
					zc++;
				}
				
			}
			if (zc==0)
				System.out.println(n + " is a prime number");
		}
		

	}

}
