import java.util.Scanner;

public class Proifelse7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

//		int a = 10;
//		int b = 20;
//		int c = 15;

		if (a > 20 && b > 20) {
			System.out.println("Both Conditions are true");
		} else if (b > 20 || c > 20) {
			System.out.println("only one condition is true");
		} else if (a > 20 && b > 20 || c > 20) {
			System.out.println("All Conditions are False");
		} else {
			System.out.println("All Conditions");
		}

	}

}
