package company;

import java.util.Arrays;

public class Alphaarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  txt = {"sakthi","tamil","shalini"};
		int len = txt.length;
		for (int k =0;k<len;k++) {
			char[] a = txt[k].toCharArray();
			char temp;
			int l = txt[k] .length();
			for (int i =0;i<l;i++)
			{
				for (int j=i+1;j<l;j++) {
					if (a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					
				}
			}
		}
		
		}
		System.out.println(Arrays.toString(txt));


	}

}
