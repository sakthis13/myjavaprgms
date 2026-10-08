package company;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) sum += digit;
            num /= 10;
        }
        System.out.println(sum); 

    
        while (sum >= 10) {
            sum = (sum % 10) + (sum / 10);
        }
        System.out.println(sum); 

	}

}
