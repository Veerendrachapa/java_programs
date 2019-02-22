package feb22ifelse;

import java.util.Scanner;

public class YearIsLeapOrNot {
	
	Scanner s = new Scanner(System.in);

	int input = s.nextInt();
	
	boolean leepyear() {
		if(input % 4 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YearIsLeapOrNot ylp = new YearIsLeapOrNot();

		if (ylp.leepyear()) {
			System.out.println("leep year");
		} else {
			System.out.println("Not leep year");
		}


	}

}
