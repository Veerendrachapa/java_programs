package feb22;

import java.util.Scanner;

public class checkWhetherANumberIsNegativeOrPositiveOrZero {
	
	static int firstNumber,secondNumber,thirdNumber;
	
	boolean checkPositiveNumber() {
		if(firstNumber>=0) {
			return true;
		}
		return false;
	}
	
	boolean checkNegitiveNumber() {
		if(secondNumber <= 0) {
			return true;
		}
		return false;
	}
	
	boolean checkZeroNumber() {
		if(thirdNumber == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number positive ");
		int firstNumber = sc.nextByte();
		System.out.println("Enter a second number negitive");
		int secondNumber = sc.nextByte();
		System.out.println("Enter a third number zero ");
		int thirdNumber = sc.nextByte();
		
		checkWhetherANumberIsNegativeOrPositiveOrZero pnz = new checkWhetherANumberIsNegativeOrPositiveOrZero();
		
		if(pnz.checkPositiveNumber()) {
			System.out.println("Entred number is positive "+firstNumber);
		}
		else {
			System.out.println("Entred number is not positive "+secondNumber);
		}
		
		if(pnz.checkNegitiveNumber()) {
			System.out.println("Enterd number is negitive");
		}
		else {
			System.out.println("Enterd number is not negitive");
		}
		
		if(pnz.checkZeroNumber()) {
			System.out.println("Entred number is zero");
		}
		else {
			System.out.println("Entred number is not zero");
		}
		
		
//		System.out.println(pnz.checkPositiveNumber());
//		System.out.println(pnz.checkNegitiveNumber());
//		System.out.println(pnz.checkZeroNumber());

	}

}
