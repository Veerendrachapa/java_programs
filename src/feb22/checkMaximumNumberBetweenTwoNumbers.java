package feb22;

import java.util.Scanner;

public class checkMaximumNumberBetweenTwoNumbers {
	static byte firstNumber,secondNumber;
	boolean checkmaximumNumberBetweenTwoNumbers() {
		if(firstNumber >= secondNumber) {
			return true;
		}
		return false;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number is ");
		byte firstNumber = sc.nextByte();
		System.out.println("Enter second number is ");
		byte secondNumber = sc.nextByte();
		
		checkMaximumNumberBetweenTwoNumbers cmnbt = new checkMaximumNumberBetweenTwoNumbers();
		if(cmnbt.checkmaximumNumberBetweenTwoNumbers()) {
			System.out.println("first number is maximum " +firstNumber);
		}
		else {
			System.out.println("second number is maximum " +secondNumber);
		}
		
//		System.out.println(cmnbt.checkmaximumNumberBetweenTwoNumbers());
//		System.out.println("Maximum number is "+firstNumber);

	}

}
