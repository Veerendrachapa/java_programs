package feb22ifelse;

import java.util.Scanner;

public class EvenOrOdd {
	Scanner sc = new Scanner(System.in);
	int evenorodd = sc.nextInt();
	
	boolean EvenorOdd() {
		if(evenorodd % 2 == 0) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd eor = new EvenOrOdd();
		if(eor.EvenorOdd()) {
			System.out.println("Even number");
		}
		else {
			System.out.println("odd Number");
		}
	}

}
