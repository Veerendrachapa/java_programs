import java.util.Scanner;

public class Proifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int input = (int) s.next().charAt(0);
		
	

		if (input > 'a' && input < 'z') {
			System.out.println("Given input is String");
		}
//		} else if(input >0 && input <9) {
//			System.out.println("Given input is Number");
//
//		}
//		else {
//			System.out.println("Upper case letter");
//		}
			else{
				System.out.println("Given input is Number");
			}
	}

}
