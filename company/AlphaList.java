package company;

public class AlphaList {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String  txt = "sakthi";
		int len = txt.length();
		char[] a = txt.toCharArray();
		char temp;
		for (int i =0;i<len;i++)
		{
			for (int j=i+1;j<len;j++) {
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		
		System.out.println(a);

	}

}
