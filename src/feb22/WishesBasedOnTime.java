package feb22;

import java.util.Scanner;

public class WishesBasedOnTime {
	
	static int firstNumber;
	
	boolean goodMorning() {
		if(firstNumber <=12) {
			return true;
		}
		return false;
	}
		boolean goodAfternoon() {
			if(firstNumber>12 && firstNumber<=18) {
				
				return true;		
			}
			return false;
		}
		
		boolean goodNight() {
			if(firstNumber>18 && firstNumber<=24) {
				return true;
			}
			return false;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number is ");
		 firstNumber = sc.nextInt();
		
		WishesBasedOnTime wishtime = new WishesBasedOnTime();
	     if(wishtime.goodMorning()) {			
			System.out.println("Good Morning :");
		}
		
		if(wishtime.goodAfternoon()) {
			System.out.println("Good Afternoon");
		}
		
		
		if(wishtime.goodNight()) {
			System.out.println("Good Night");
		}
		
		
	}

}
