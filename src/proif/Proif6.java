package proif;

import java.util.Scanner;

public class Proif6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        
        if(time<=12){
            System.out.println("Good Monring!!");
        }
        
        if(time > 12 && time < 18){
            System.out.println("Good Afternoon!!");
        }
        
        if(time >= 18 && time <= 24){
            System.out.println("Good Night!!");
        }
        
        if(time > 24){
            System.out.println("Invalid Input, please try again!");
        		}
	}
}
