package proif;

import java.util.Scanner;

public class Proif5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int positiveNumber = s.nextInt();

        if(positiveNumber>0){
        	System.out.println("The Input is Positive Number");
        }
        int zeroNumber = s.nextInt();
        if(zeroNumber==0){
        	System.out.println("The Input is zero Number");
        }
        int negitiveNumber = s.nextInt();
        if(negitiveNumber<0){
        	System.out.println("The Input is Negitive Number");
        }
	}

}
