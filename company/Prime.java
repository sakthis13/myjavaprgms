package company;

public class Prime {

	public static void main(String[] args) {
		int n = 7;
		int zc=0;
		for (int i =2;i<n;i++)
		{
			if (n%i==0)
				zc++;
		}
		if (zc==0)
			System.out.println("n is a prime number.");
		else
			System.out.println("not a prime number.");
	}

}
