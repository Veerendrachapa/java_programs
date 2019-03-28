// 6. Write a program to print given values all are equal or some 
// values are equal or all are different using nested if? 

// Input:  
// a = 10, b = 10, c = 10, d = 10  
// Output:  
// all values are equal 

// Input:  
// a = 10, b = 20, c = 30, d = 10
// Output:  
// a, d values are the same  

// Input:
// a = 10, b = 10, c = 20, d = 10  
// Output:  
// a, b, c values are the same 

// Input:  
// a = 10, b = 20, c = 25, d = 30  
// Output:  
// All values are different    

import java.util.Scanner;

public class GivenValuesAllAreEqualOrNot {
	void Take_four_input (int a, int b, int c, int d) {
		
		if(a!=b) {
			if(a!=c) {
				if(c!=d) {
					if(b!=c) {
						if(b!=d) {
							if(a!=d) {
								System.out.println("all values are not equal");
							}
							else {
								System.out.println("a and d values are same");
							}
						}
						
					}
					
				}
				
			}
			
		}
		
		else {
			if(a==b) {
				if(a==c) {
					if(b==c) {
						if(a==d) {
							if(b==d) {
								if(c==d) {
									System.out.println("all values are equal");
								}
							}
						}
						else {
							System.out.println("a,b,c values are same");
						}
					}
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GivenValuesAllAreEqualOrNot obj=new GivenValuesAllAreEqualOrNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  value is: "); // all values are equal
		int a = sc.nextInt();
		System.out.println("Enter b  value is: "); // all values are not equal
		int b = sc.nextInt();
		System.out.println("Enter c  value is: "); // a,d are same values
		int c = sc.nextInt();
		System.out.println("Enter d  value is: "); // a, b, c values are same
		int d = sc.nextInt();
		
		obj.Take_four_input (a,b,c,d);
	}

}
