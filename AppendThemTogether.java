// 3. Given two strings, append them together (known as "concatenation") and
//  return the result. However, if the concatenation creates a double-char, 
//  then omit one of the chars, so "abc" and "cat" yields "abcat".

// input = conCat("abc", "cat") → output = "abcat"

import java.util.Scanner;
class AppendThemTogether {

	public static void main(String[] args) {

		AppendThemTogether obj = new AppendThemTogether();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(obj.conCat(a,b));
		
		
	}
	
	
	public static String conCat(String a , String b){
		
      if (a.length()>0 && b.length()>0 && b.charAt(0)==a.charAt(a.length()-1))
       b=b.substring(1);
       return a+b;
   }
}

// public String conCat(String a, String b) {
//   if (a.length() == 0 || b.length() == 0)
//     return a+b;
//   if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1)))
//     return a + b.substring(1,b.length());
//   else
//     return a+b;
// }

//=====================================================

// public String conCat(String a, String b) {
// if (a.length()>0 && b.length()>0 && b.charAt(0)==a.charAt(a.length()-1))
// b=b.substring(1);
// return a+b;
// }

//=======================================================

// public String conCat(String a, String b) {
// if(!(a.length()==0||b.length()==0)&&a.substring(a.length()-1).equals(b.substring(0,1))){
// return a+b.substring(1);
// }else return a+b;


