import java.util.Scanner;

public class Driver {
		
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your credit card number");
		long card = sc.nextLong();
		Validator v = new Validator(card);
		if(v.checkValidity()) {
			System.out.println("The card is valid");
		}
		else {
			System.out.println("The card is invalid");
		}
		
		sc.close();
	}
}
