package feb22ifelse;

import java.util.Scanner;

public class MultipliedByGivenNumbers {
	
	static int input;
	
	
	
	boolean Multiplyed3And5() {
		if(input%3 == 0 && input%5 == 0) {
			return true;
		}
		return false;
	}

	boolean Multiplyed3And4() {
		if(input%3 == 0 && input%4 != 0) {
			return true;
		}
		return false;
	}
	
	boolean Multiplyed2And4() {
		if(input%2 !=0 && input%4 !=0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enterd input value is ");
		int input = s.nextInt();
		
		MultipliedByGivenNumbers mng = new MultipliedByGivenNumbers();
		
		if(mng.Multiplyed3And5()) {
			System.out.println("15 is multiple by 3 and 5");
		}
		 if(mng.Multiplyed3And4()) {
			System.out.println("15 is not multiple by 4");
		}
		 if(mng.Multiplyed2And4()) {
			System.out.println("15 is not multiple by 2 and 4");
		}
		 
//		else {
//			System.out.println("15 is input");
//		}

	}

}
