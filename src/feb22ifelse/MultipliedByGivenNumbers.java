package feb22ifelse;

import java.util.Scanner;

public class MultipliedByGivenNumbers {
	
	static int input, input1, input2, input3, input4;  
	
	//input = 15, input1 = 3, input2 = 5, input3 = 4, input4 = 2
	
	
	
	boolean Multiplyed3And5() {
		if(input%input1 == 0 && input%input2 == 0) {
			return true;
		}
		return false;
	}

	boolean Multiplyed3And4() {
		if(input%input1 == 0 && input%input3 != 0) {
			return true;
		}
		return false;
	}
	
	boolean Multiplyed2And4() {
		if(input%input4 !=0 && input%input3 !=0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enterd input value is ");
		 input = s.nextInt();
		System.out.println("Enterd input1 value is ");
		 input1 = s.nextInt();
		System.out.println("Enterd input2 value is ");
		 input2 = s.nextInt();
		System.out.println("Enterd input3 value is ");
		 input3 = s.nextInt();
		System.out.println("Enterd input4 value is ");
		 input4 = s.nextInt();
		
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
