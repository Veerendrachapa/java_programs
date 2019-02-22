package proif;

import java.util.Scanner;

public class Proif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Program Number#3 - Check whether the given number is even.");
		 Scanner sc = new Scanner(System.in);
		 int numberToChcek = sc.nextInt();        
	        System.out.println("You entered :"+ numberToChcek);
	        if(numberToChcek %2 ==0)
	        {
	            System.out.println("Even Number");
		 
	        }
	}
}
