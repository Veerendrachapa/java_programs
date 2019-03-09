import java.util.Scanner;

public class Proifelse13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String stringCase = s.next().toLowerCase();
		System.out.println(stringCase);
		char caseLetter = stringCase.charAt(0);
		int asciiValue = (int) caseLetter;

		if(asciiValue >='a' && asciiValue <='z'){
			System.out.println("The letter is lower case ");
		}
//		else if(asciiValue >= 65 && asciiValue <= 90) {
//			System.out.println("The letter is Upper case ");
//		}
		else if(asciiValue >= 48 && asciiValue <= 57) {
			System.out.println("The letter is Number ");
		}
		else {
			System.out.println("The letter is Special Symbol ");
		}

	}

}
