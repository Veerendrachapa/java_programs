package proif;

import java.util.Scanner;

public class Proif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Number 5 – Check the maximum number from the given two numbers");

		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();

		if(firstNumber > secondNumber)
		{
			System.out.println(firstNumber +"is the maximum number");
		}

		if(secondNumber > firstNumber)
		{
			System.out.println(secondNumber +"is the maximum number");
		}

		if(secondNumber == firstNumber)
		{
			System.out.println("Both numbers are same");
		}
			}
}
