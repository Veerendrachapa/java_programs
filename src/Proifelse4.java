import java.util.Scanner;

public class Proifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int input = s.nextInt();
        if (input < 18) {
			System.out.println("Person is not eligible for government job");
		} else if (input < 35) {
		System.out.println("person is eligible for government job");
		
//		if( input >18 && input<35) {
//			System.out.println("person is eligible for government job");
//		
//		}else if(input<18) {
//			System.out.println("Person is not eligible for government job");
		}
		else if (input < 50) {
			System.out.println("Your age is expired for applying the government job");
		} else {
			System.out.println("person is old");
		}

	}

}
