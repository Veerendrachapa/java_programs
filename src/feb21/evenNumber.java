package feb21;

import java.util.Scanner;

public class evenNumber {
	Scanner sc = new Scanner(System.in);
	int evenNumber = sc.nextInt();
	
//	int evenNumber = 4;
	
	void even() {
		if(evenNumber%2 ==0) {
			System.out.println("Even number is "+evenNumber);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenNumber en = new evenNumber();
		en.even();

	}

}
