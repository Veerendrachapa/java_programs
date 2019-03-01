package ifelseif;

import java.util.Scanner;

public class CharacterIsUppercaseOrLowercase {
	
	Scanner s = new Scanner(System.in);
	String stringcase = s.next().toLowerCase();
	char caseletter = stringcase.charAt(0);
	int asciivalue = (int)caseletter;
	
	boolean letter1() {
		if(asciivalue>=97 && asciivalue <=122) {
			return true;
		}
		return false;
	}
		
		boolean letter2() {
			if(asciivalue>=65 && asciivalue<=90) {
			return true;
		}
		return false;
}

		boolean letter3() {
			if(asciivalue>=48 && asciivalue<=57) {
			return true;
		}
		
		 
			return false;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 2-check whether a character is uppercase or lowercase");
		CharacterIsUppercaseOrLowercase cul = new CharacterIsUppercaseOrLowercase();
		if(cul.letter1()) {
			System.out.println("lower case letter a to z");
		}
		else if(cul.letter2()) {
			System.out.println("upper case letter A to Z");
		}
		else if(cul.letter3()) {
			System.out.println("It is a number");
		}
		else {
			System.out.println("Special character");
		}
		

	}

}
