package exceptionsCatcher;

public class Divisor {
	
	public static int divide(int a, int b){
		int result = 0;
		try {
		if(b>a) {
			throw new NumberTooLargeException();
		}
		return a/b;
		
		}
		catch (ArithmeticException cannotDivideByZero){
			System.out.println("Can't divide by zero");
			result = a;
		}
		catch (NumberTooLargeException ntbe){
			System.out.println("Second number was bigger than the first number");
		}
		
		return result;
	
		}
}