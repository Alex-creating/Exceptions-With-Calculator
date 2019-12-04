package exceptionsCatcher;

public class Divisor {
	
	public static int divide(int a, int b){
		int result = 0;
		
		try{
			result = a/b;
		}
		catch (ArithmeticException cannotDivideByZero){
			System.out.println(cannotDivideByZero.toString());
			result = a;
		}
		
		return result;
	}

}
