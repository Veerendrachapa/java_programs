package feb22;

import java.util.Scanner;

public class checkWhetherANumberIsNegativeOrPositiveOrZero {

	static int firstNumber;

	boolean checkPositiveNumber() {
		if (firstNumber > 0) {
			return true;
		}
		return false;
	}

	boolean checkNegitiveNumber() {
		if (firstNumber < 0) {
			return true;
		}
		return false;
	}

	boolean checkZeroNumber() {
		if (firstNumber == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		 firstNumber = sc.nextByte();
		

		checkWhetherANumberIsNegativeOrPositiveOrZero pnz = new checkWhetherANumberIsNegativeOrPositiveOrZero();

		if (pnz.checkPositiveNumber()) {
			System.out.println("Entred number is positive ");
		}

		if (pnz.checkNegitiveNumber()) {
			System.out.println("Enterd number is negitive");
		}

		if (pnz.checkZeroNumber()) {
			System.out.println("Entred number is zero");
		}

//		System.out.println(pnz.checkPositiveNumber());
//		System.out.println(pnz.checkNegitiveNumber());
//		System.out.println(pnz.checkZeroNumber());

	}

}
