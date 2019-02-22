package feb21;

import java.util.Scanner;

public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte to char not converted the value
		
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		char d = (char)b;
		
//		byte a = 46;
//		char c = (char)a;
//		
		System.out.println(d);

	}

}
