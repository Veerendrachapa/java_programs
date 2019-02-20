import java.util.Scanner;

public class Proifelse9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
//     	char ch = s.next().charAt(0); //it is read first letter only java o/p = j
		
		String ch = s.next().toLowerCase();

//		char ch = 'i';

		if (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u") {
			System.out.println("vowel is " + ch);
		} else {
			System.out.println("consonant is " + ch);
		}
	}

}
