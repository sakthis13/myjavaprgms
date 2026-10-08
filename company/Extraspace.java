package company;

public class Extraspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "i     am                good                .";
		int len= text.length();
		for(int i =0;i<len;i++) {
			if (text.charAt(i)==' ' && text.charAt(i+1)==' ') {
				continue;
			}
			else {
				System.out.print(text.charAt(i));
			}
		}

	}

}
