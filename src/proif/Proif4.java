package proif;

import java.util.Scanner;

public class Proif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int maximumNumber = s.nextInt();
		int minimumNumber = s.nextInt();

		if (maximumNumber>minimumNumber){
			System.out.println("The Given Input maximum number is "+maximumNumber);

		}
		if(minimumNumber<maximumNumber){
			System.out.println("The Given Input maximum number is "+maximumNumber);
		}

	}

}
