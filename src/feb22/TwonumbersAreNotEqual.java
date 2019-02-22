package feb22;

import java.util.Scanner;

public class TwonumbersAreNotEqual {
	
static int firstNumber,secondNumber;
	
	boolean notEqual() {
		if(firstNumber == secondNumber) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number is ");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number is ");
		secondNumber = sc.nextInt();
		
		TwoValuesAreEqual notEqual = new TwoValuesAreEqual();
		if(notEqual.valuesEqual()) {
			System.out.println("Two numbers are not equal equal");
		}
		
		}
		

	}


