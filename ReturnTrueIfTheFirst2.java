// 2. Given a string, return true if the first 2 chars in the 
// string also appear at the end of the string, such as with "edited".

// input  = frontAgain("edited") → output = true

import java.util.Scanner;

class ReturnTrueIfTheFirst2 {
	public boolean frontAgain(String str) {

  if (str.length() < 2) return false;
  else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))return true;
  else
  return false;

}

public static void main(String [] args){
	ReturnTrueIfTheFirst2 obj = new ReturnTrueIfTheFirst2();
	Scanner sc = new Scanner(System.in);
	String str = sc.next();

	System.out.println(obj.frontAgain(str));
}
}


// public boolean frontAgain(String str) {
// return str.length()>=2 && str.substring(0, 2).equals(str.substring(str.length()-2, str.length())); 
// }


// public boolean frontAgain(String str) {
// if(str.length()>1 && str.charAt(0) == str.charAt(str.length()-2) 
// && str.charAt(1) == str.charAt(str.length()-1))
// return true;
// else return false; 
// }



