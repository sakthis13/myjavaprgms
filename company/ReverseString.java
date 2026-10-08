package company;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 291;
        int reversed = 0;

        while (num > 0) {
            int a = num % 10;
            reversed = (reversed * 10) + a;
            num /= 10;
        }

        System.out.println(reversed);

	}

}
