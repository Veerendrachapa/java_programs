package feb22;

import java.util.Scanner;

public class checkWhetherGivenNumberIsOdd {
	
	Scanner sc = new Scanner(System.in);
	byte GivenNumberIsOdd = sc.nextByte();
	
	boolean whetherGivenNumberIsOdd() {
		if(GivenNumberIsOdd %2 !=0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkWhetherGivenNumberIsOdd  cwgo = new checkWhetherGivenNumberIsOdd();
		
		if(cwgo.whetherGivenNumberIsOdd()) {
			System.out.println(" Given Number is odd");
		}
		else {
			System.out.println(" Given Number is not a odd");	
		}
		
//		System.out.println(cwgo.whetherGivenNumberIsOdd());
	}

}
