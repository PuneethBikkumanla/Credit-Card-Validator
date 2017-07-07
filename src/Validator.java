import java.util.LinkedList;

public class Validator {
	LinkedList<Long> stack;
	int counter = 1, total;
	long cardNumber, temp;
	
	public Validator(long cardNumber) {
		this.cardNumber = cardNumber;
		stack = new LinkedList<Long>();
	}
	
	public boolean checkValidity() {
		
		while( cardNumber > 0){
			stack.push(cardNumber%10);
			cardNumber /= 10;
		}
		
		while (!stack.isEmpty()) {
			temp = stack.pop();
			if( counter % 2 == 1) {
				total += temp;
			}
			else {
				temp *= 2;
				total += temp%10 + temp/10;
			}
			counter++;
		}
		
		if(total%10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
