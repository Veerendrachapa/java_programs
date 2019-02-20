import java.util.Scanner;

public class Proifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int input = s.nextInt();

		if (input < 18) {
			System.out.println("Person is minor");
		}

		else {
			System.out.println("person is Major");
		}
	}

}
