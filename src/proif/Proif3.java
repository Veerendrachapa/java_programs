package proif;

import java.util.Scanner;

public class Proif3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Program Number#4 - Check whether the given number is Odd.");
	        Scanner sc = new Scanner(System.in);
	        int oddNumberToChcek = sc.nextInt();        
	        System.out.println("You entered :"+ oddNumberToChcek);
	        if(oddNumberToChcek %2 !=0)
	        {
	            System.out.println("Odd Number");       
		}
	}
}
