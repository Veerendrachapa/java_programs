package ifelseif;

import java.util.Scanner;

public class maximumNumber {

	static int firstNumber, secondNumber, thirdNumber;
		
		
		boolean firstmaximumNumber() {
			if(firstNumber>secondNumber && firstNumber>thirdNumber) {
				return true;
			}
			return false;
		}
			boolean secondmaximumNumber() {
				if(secondNumber>firstNumber && secondNumber>thirdNumber) {
					return true;
				}
				return false;
			}
			
			boolean thirdmaximumNumber() {
				if(thirdNumber>firstNumber && thirdNumber>secondNumber) {
					return true;
				}
				return false;
			}
			
			public static void main(String[] args) {
			// TODO Auto-generated method stub
				System.out.println("Program Number 1- find maximum number among three numbers");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a first number ");
			      firstNumber = sc.nextInt();
				System.out.println("Enter a second number ");
				 secondNumber = sc.nextInt();
				System.out.println("Enter a third number ");
				 thirdNumber = sc.nextInt();
				
			
			maximumNumber mn = new maximumNumber();
			if(mn.firstmaximumNumber()) {
				System.out.println("First Number is Maximum");
			}
			else if(mn.secondmaximumNumber()) {
				System.out.println("Second Number is Maximum");
			}
			else if(mn.thirdmaximumNumber()) {
							System.out.println("Third Number is Maximum");
						}
			else {
				System.out.println("Not a maximum number");
			}
						
	}

}
