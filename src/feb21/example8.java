package feb21;

import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//convert short to byte explicit type cast
		
		Scanner sc = new Scanner(System.in);
		short c = sc.nextShort();
		byte d = (byte)c;
		
		
//		short a = 12;
//		byte b = (byte)a;
//		
		System.out.println(d);

	}

}
