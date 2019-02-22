package feb22ifelse;

import java.util.Scanner;

public class LogicalOperators {
	
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	boolean conditionsAreTrue() {
		if(a > 20 && b > 20) {
			return true;
		}
		return false;
	}
	
	boolean oneConditionsAretrue() {
		if(a > 20 && b > 20 || c > 20) {
			return true;
	}
	return false;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogicalOperators lo = new LogicalOperators();
		

//		int a = 10;
//		int b = 20;
//		int c = 15;

		if (lo.conditionsAreTrue()) {
			System.out.println("Both Conditions are true");
		} 
		if (lo.oneConditionsAretrue()) {
			System.out.println("only one condition is true");
		} 
		
		
		

	}

}
