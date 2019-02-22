import java.util.Scanner;

public class Proifelse11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char caseLetter = s.next().charAt(0);
		int asciiValue = caseLetter;

		if(caseLetter >'a' && caseLetter <'z'){
			System.out.println("The letter is lower case "+asciiValue);
		}
		else if(caseLetter>'A' && caseLetter <'Z') {
			System.out.println("The letter is Upper case "+asciiValue);
		}
		else if(caseLetter> 0 && caseLetter < 9) {
			System.out.println("The letter is Number "+asciiValue);
		}
		else {
			System.out.println("The letter is Special Symbol "+asciiValue);
		}
	}

}
