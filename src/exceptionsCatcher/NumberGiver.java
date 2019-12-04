package exceptionsCatcher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGiver {

	public static int giveNumber1() {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Pick your first number");
		int choice1 = 0;
		
		try {
		choice1 = scan1.nextInt();
		}
		catch (InputMismatchException wrongInput) {
			System.out.println(wrongInput.toString());
		}
		return choice1;

	}

	public static int giveNumber2() {
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Pick your second number");
		int choice2 = 0;
		
		try {
			choice2 = scan2.nextInt();
			}
			catch (InputMismatchException wrongInput) {
				System.out.println(wrongInput.toString());
			}
	
			return choice2;	
			
		
		
	}
}
