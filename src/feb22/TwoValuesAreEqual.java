package feb22;

import java.util.Scanner;

public class TwoValuesAreEqual {
	
	static int firstNumber,secondNumber;
	
	boolean valuesEqual() {
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
		
		TwoValuesAreEqual Equal = new TwoValuesAreEqual();
		if(Equal.valuesEqual()) {
			System.out.println("Two numbers are equal");
		}
		
		

	}

}
