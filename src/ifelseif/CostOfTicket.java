package ifelseif;

import java.util.Scanner;

public class CostOfTicket {
	
	
	static void distance(String s1, String s2) {
		if(s1.equalsIgnoreCase("miyapur")&&s2.equalsIgnoreCase("jntu")) {
			System.out.println("Cost of ticket distance between s1 and s2 is 10");
		}
	
//		static void distance1() {
//		 if(s1.equalsIgnoreCase(s2)) {
//			System.out.println("Cost of ticket distance between s1 and s2 is 20");
//		}
		
//		static void distance2() {
//		 if(s2.equalsIgnoreCase(s3)) {
//			System.out.println("Cost of ticket distance between s2 and s3 is 10");
//		}
		
		else {
			System.out.println("Cost of ticket distance between s2 and s1 is 20");
		}
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 8- a program to print cost of ticket based on the distance between 2 metro stations");
        Scanner sc = new Scanner(System.in);
        System.out.println("String s1 is ");
         String s1 = sc.next();
         System.out.println("String s2 is ");
        String s2 = sc.next();
//         System.out.println("String s3 is ");
//         s3 = sc.next();
//         
         CostOfTicket cot = new CostOfTicket();
         cot.distance(s1,s2);
//         cot.distance1();
//         cot.distance2();
	}

}
