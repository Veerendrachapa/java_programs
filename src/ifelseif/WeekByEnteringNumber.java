package ifelseif;

import java.util.Scanner;

public class WeekByEnteringNumber {
	
	static int number;
	
	static void week(int number) {
		if(number == 1) {
			System.out.println("Monday");
		}
		else if(number == 2) {
			System.out.println("Tuesday");
		}
		else if(number == 3) {
			System.out.println("Wensday");
		}
		else if(number == 4) {
			System.out.println("Thersday");
		}
		else if(number == 5) {
			System.out.println("Friday");
		}
		else if(number == 6) {
			System.out.println("Saterday");
		}
		else if(number == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("invalid input");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 4- a program to print day of week by entering number as input");
		Scanner sc = new Scanner(System.in);
		 number = sc.nextInt();
		WeekByEnteringNumber wen = new WeekByEnteringNumber();
		wen.week(number);

	}

}
