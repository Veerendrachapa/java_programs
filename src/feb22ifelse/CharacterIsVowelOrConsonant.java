package feb22ifelse;

import java.util.Scanner;

public class CharacterIsVowelOrConsonant {
	Scanner s = new Scanner(System.in);
	String ch = s.next().toLowerCase();
	
	boolean vowelOrConsonant() {
		if(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u") {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharacterIsVowelOrConsonant vc = new CharacterIsVowelOrConsonant();
		
		if (vc.vowelOrConsonant()) {
			System.out.println("Character is vowel ");
		} else {
			System.out.println("Character is consonant ");
		}


	}

}
