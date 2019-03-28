/*4. Write a program to check whether given number is odd using if condition?
Input : 3
Output : Odd Number
*/

import java.util.Scanner;

public class GivenNumberIsOdd {
	
	static void odd(int number) {
		if(number%2 != 0) {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program Number 4-a program to check whether given number is odd");
        Scanner sc = new Scanner(System.in); // object creation
        int number = sc.nextInt();
        
        GivenNumberIsOdd gno = new GivenNumberIsOdd(); // object creation
        gno.odd(number);
   
	}

}
