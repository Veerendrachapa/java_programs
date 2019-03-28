// Given a string, if the first or last chars are 'x', return 
// the string without those 'x' chars, and otherwise return 
// the string unchanged.


// withoutX("xHix") → "Hi"
// withoutX("xHi") → "Hi"
// withoutX("Hxix") → "Hxi"


import java.util.Scanner;

class ReturnWithoutX {
public String withoutX(String str) {

	return str.startsWith(replace("x", ""));

// int position;
//         int length;
//         if (str.length() % 2 == 0)
//         {
//             // position = str.length() / 2 - 1;
//             position = str.length() / 2 ;
//             length = 1;
//             // System.out.println(str.substring(position, position + length));

//             return str.substring(position, position + length);
//         }
//         else
//         {
//             position = str.length() / 2;
//             length = 3;
//              // System.out.println(str.substring(position, position + length));
//         }

//         return str.substring(position, position + length);


	 // int position;    // input = "xxxhixx"
  //       int length;
  //       if(str.length() % 2 !=0)
  //       {
  //           position = str.length() / 2; // position tell to which position you need the answer
  //           length = 2; // length is incremented 
  //           // if length is 2 output is hi 
  //           // if length is 3 output is hix
  //           System.out.println(str.substring(position, position + length));
  //       }

	  // return str.replace("x", "");

// if(str.length()==0 || str.length()==1)
// return "";
// else if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
// return str.substring(1,str.length()-1);
// else if(str.charAt(0) == 'x')
// return str.substring(1,str.length());
// else if(str.charAt(str.length()-1) == 'x')
// return str.substring(0,str.length()-1);
// else return str;
}
public static void main(String[] args){
	ReturnWithoutX obj = new ReturnWithoutX();
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	 // System.out.println("ReturnWithoutX :  "+obj.withoutX(str));
	System.out.println(obj.withoutX(str).trim()); 
}
}













//==============================================
// public String withoutX(String str) { 
//   if (str.length() == 0)
//     return str;
//   if (str.length() == 1){
//     if (str.charAt(0) == 'x')
//       return "";
//     else
//       return str;
//   }
//   if (str.charAt(0) == 'x')
//     str = str.substring(1,str.length());
//   if (str.charAt(str.length()-1) == 'x')
//     str = str.substring(0,str.length()-1);
//   return str;
// }


// =======================================

// public String withoutX(String str) {
// String sum="";
// if(!str.contains("x")){
// return str;
// }
// if(str.charAt(0)=='x'&&str.charAt(str.length()-1)!='x'){
// sum=sum+str.substring(1);
// }
// else if(str.charAt(0)!='x'&&str.charAt(str.length()-1)=='x'){
// sum=sum+str.substring(0,str.length()-1);
// }
// else if(str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x'){
// for(int i=1;i<str.length()-1;i++){
// sum=sum+str.substring(i,i+1);
// }
// }
// else if(str.charAt(0)!='x'&&str.charAt(str.length()-1)!='x'){
// return str;
// }
// return sum;
// }

// ======================================================

// public String withoutX(String str) {
// StringBuilder result = new StringBuilder(str);
// if (!str.isEmpty() && str.length() > 1 && str.charAt(str.length()-1) == 'x') {
// result = result.deleteCharAt(str.length()-1);
// }
// if (!str.isEmpty() && str.charAt(0) == 'x') {
// result = result.deleteCharAt(0);
// }
// return result.toString();
// }

// =========================================================

// public String withoutX(String str) {
// if(str.length()==0 || str.length()==1)
// return "";
// else if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
// return str.substring(1,str.length()-1);
// else if(str.charAt(0) == 'x')
// return str.substring(1,str.length());
// else if(str.charAt(str.length()-1) == 'x')
// return str.substring(0,str.length()-1);
// else return str;
// }

// ===================================================

// public String withoutX(String str) {
// int len = str.length();
// String word = "";
// for (int i = 0; i < len; i++){
// if (i == 0 && str.charAt(0) != 'x') {
// word += str.charAt(0);
// } else if (i > 0 && i < len-1) {
// word += str.charAt(i);
// } else if (i == len-1 && str.charAt(len-1) != 'x') {
// word += str.charAt(len-1);
// }
// }
// return word;
// }

// =================================================

// if (str.length() <= 1) 
// return "";
// if (str.charAt(0) == 'x') 
// str = str.substring(1, str.length());
// if (str.charAt(str.length()-1) == 'x')
// str = str.substring(0, str.length()-1);
// return str;

// ================================================

