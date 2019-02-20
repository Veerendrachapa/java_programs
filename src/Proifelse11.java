import java.util.Scanner;

public class Proifelse11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		int ascii = ch;

		if(ch >'a' && ch <'z'){
			System.out.println("The letter is lower case "+ascii);
		}
		else if(ch>'A' && ch <'Z') {
			System.out.println("The letter is Upper case "+ascii);
		}
		else if(ch> 0 && ch < 9) {
			System.out.println("The letter is Number "+ascii);
		}
		else {
			System.out.println("The letter is Special Symbol "+ascii);
		}
	}

}
