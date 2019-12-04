package exceptionsCatcher;

public class App {

	public static void main(String[] args) {
		
		int number1 = NumberGiver.giveNumber1();
		int number2 = NumberGiver.giveNumber2();
		
		System.out.println("Your first number is: " +number1 );
		System.out.println("Your second number is: " +number2 );
		
		System.out.println("These divided are: " +Divisor.divide(number1, number2));
	}

}
