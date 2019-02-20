import java.util.Scanner;

public class Proifelse14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		int input1 = s.nextInt();
		int input2 = s.nextInt();
		int input3 = s.nextInt();
		int input4 = s.nextInt();
		
		if(input%input1 == 0 && input%input2 == 0) {
			System.out.println("15 is multiple by 3 and 5");
		}
		else if(input%input1 == 0 && input%input3 != 0) {
			System.out.println("15 is not multiple by 4");
		}
		else if(input%input3 !=0 && input%input4 !=0) {
			System.out.println("15 is not multiple by 2 and 4");
		}
		else {
			System.out.println("15 is input");
		}

	}

}
