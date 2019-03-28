// 5. Write a program to print the below output using nested if?  
// Take two input values and print below outputs

// Input:  a : 10 b : 20  
// a is not equal to b         
//  or  
//  a is greater than b           
// or  
// b is greater than a 
//or
//a equal to b          
 

import java.util.Scanner;
public class TakeTwoInputValues {
	void Take_two_input (int a, int b) {
		if(a!=b) {
			if(a<b) {
			System.out.println("b grater than a");
			}
			else {
				System.out.println("a not equal to b");
			}
			
		}
		if(a==b){
			System.out.println("a equal to b");
		}
		else {
			
			if(a>b){
				System.out.println("a grater than b");
				
			}
			
		}	 
	}
	public static void main(String args[])
	{
		TakeTwoInputValues o1=new TakeTwoInputValues();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = 10 value is: ");
		int a = sc.nextInt();
		System.out.println("Enter b = 45 value is: ");
		int b = sc.nextInt();
		o1.Take_two_input (a,b); // 10,45
	}
}
