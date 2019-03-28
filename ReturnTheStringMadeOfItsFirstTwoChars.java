// 2. Given a string, return the string made of its first two chars, so the String 
// "Hello" yields "He". If the string is shorter than length 2, return whatever 
// there is, so "X" yields "X", and the empty string "" yields the empty string "". 

// Note that str.length() returns the length of a string.

// input = firstTwo("Hello") →  output = "He"



import java.util.Scanner;
class ReturnTheStringMadeOfItsFirstTwoChars {

public String firstTwo(String str) {
  int len = str.length();
  if (len < 2)
    return str;
  else
    return str.substring(0,2);
}

public static void main(String [] args){
	ReturnTheStringMadeOfItsFirstTwoChars obj = new ReturnTheStringMadeOfItsFirstTwoChars();
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println(obj.firstTwo(str));
}
}



//=============================
// public String firstTwo(String str) {
//     if(str.length() < 2)
//         return str;
          
//     return str.substring(0, 2);
// }