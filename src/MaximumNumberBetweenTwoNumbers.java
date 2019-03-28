

import java.util.Scanner;

public class MaximumNumberBetweenTwoNumbers {
	
	void num(int firstNumber, int secondNumber) {
		if(firstNumber>=secondNumber) {
			System.out.println("Number is maximum");
		}
		else {
			System.out.println("Number is minimum");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 5- a program to check   maximum number between two numbers using if condition");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number is = ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter a second number is = ");
		int secondNumber = sc.nextInt();
		
		MaximumNumberBetweenTwoNumbers max = new MaximumNumberBetweenTwoNumbers();
		max.num(firstNumber, secondNumber);
		
	}

}
