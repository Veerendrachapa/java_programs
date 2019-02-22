package feb22ifelse;

import java.util.Scanner;

public class ValueisStringOrNumber {
	Scanner s = new Scanner(System.in);
	String stringCase = s.next().toLowerCase();
//	System.out.println(stringCase);
	char caseLetter = stringCase.charAt(0);
	int asciiValue = (int) caseLetter;
	
	boolean stringValue() {
		if(asciiValue >=97 && asciiValue <=122) {
			return true;
		}
		return false;
	}

	boolean valueNumber() {
		if(asciiValue >= 48 && asciiValue <= 57) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValueisStringOrNumber sn = new ValueisStringOrNumber();

		if(sn.stringValue()){
			System.out.println("The letter is lower case ");
		}
		 if(sn.valueNumber()) {
			System.out.println("The letter is Number ");
		}
		
		}


	}


