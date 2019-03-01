package ifelseif;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	static int month;
	
	static void Month(int month) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 days in this moth");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 days in month");
		}
		else if(month == 2) {
			System.out.println("Either 28 or 29 Days in this month");
		}
		else {
			System.out.println("please enter valid number 1 to 12");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Programs Number 5- a program to find number of days in month");
     Scanner sc = new Scanner(System.in);
      month = sc.nextInt();
      NumberOfDaysInMonth ndm = new NumberOfDaysInMonth();
      ndm.Month(month);
	}

}
