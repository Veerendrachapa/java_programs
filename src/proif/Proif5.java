package proif;

import java.util.Scanner;

public class Proif5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Program Number 6 – Entered input is Positive number");
	        int firstNumber=sc.nextInt();
	   	 System.out.println("Program Number 6 – Entered input is negative number");
	        double secondNumber=sc.nextInt();
	   	 System.out.println("Program Number 6 – Entered input is zero number");
	        int thirdNumber=sc.nextInt();
	        
	        if(firstNumber >0)
	        {
	            System.out.println(firstNumber +" is positive number");
	        }
	        
	        if(secondNumber <0)
	        {
	            System.out.println(secondNumber +" is negative number");
	        }
	        
	        if(thirdNumber ==0)
	        {
	            System.out.println(thirdNumber +" is zero number"
	            		+ ""
	            		+ "");
	            
	            
		        }
	}
}
