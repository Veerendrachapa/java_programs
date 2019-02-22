package ifelseif;

import java.util.Scanner;

public class maximumNumber {

	
		
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		
		void maximumNumber() {
			if(firstNumber>secondNumber || secondNumber>thirdNumber || thirdNumber>firstNumber) {
				System.out.println("Maximum Number "+firstNumber);
			}
//			else if(secondNumber>thirdNumber) {
//				System.out.println("Maximum number "+secondNumber);
//			}
//			else if(thirdNumber>firstNumber) {
//				System.out.println("Maximum number "+thirdNumber);
//			}
			else {
				System.out.println("Minimum Number");
			}

			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			maximumNumber mn = new maximumNumber();
			mn.maximumNumber();
		
	}

}
