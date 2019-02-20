import java.util.Scanner;

public class Proifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int evenOrOdd = s.nextInt();

		if (evenOrOdd % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

}
