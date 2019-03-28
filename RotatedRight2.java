// 1. Given a string, return a "rotated right 2" version 
// where the last 2 chars are moved to the start. 
// The string length will be at least 2.

//  input = right2("Hello") → output = "loHel"

import java.util.Scanner;
class RotatedRight2 {
	public String right2(String str) {
     return str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2);
}
public static void main(String [] args){
	RotatedRight2 obj = new RotatedRight2();
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println(obj.right2(str));
}
}



