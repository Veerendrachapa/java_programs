import java.util.Scanner;
public class ReturnWithoutX2 {
	public static void main(String [] args){
		 ReturnWithoutX2 obj = new ReturnWithoutX2();
		 Scanner sc = new Scanner(System.in);
		 // System.out.println("Enter a String is : ");
         // String str = sc.next();
         // System.out.println("Withoutx1 "+obj.Withoutx1(str));
         System.out.println("removeSpaces "+obj.removeSpaces());
         // System.out.println("Withoutx2 "+obj.Withoutx2());
         // System.out.println("Withoutx3 "+obj.Withoutx3());
         // System.out.println("Withoutx4 "+obj.Withoutx4());
         // System.out.println("Withoutx5 "+obj.Withoutx5());
	}
	// 	 String Withoutx1(String str){
	// 	 if(str.length()==0 || str.length()==1)
	// 	 return "";
	// 	 else if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
	// 	 return str.substring(1,str.length()-1);
	// 	 else if(str.charAt(0) == 'x')
	// 	 return str.substring(1,str.length());
	// 	 else if(str.charAt(str.length()-1) == 'x')
	// 	 return str.substring(0,str.length()-1);
	// 	 else return str;
	// }

	//      String Withoutx2(){
	// 	 Scanner in1 = new Scanner(System.in);
	// 	 System.out.println("Enter a string xxxxxhixxxx is ");
	// 	 String str1 = in1.next();//"xxxxxhixxxx";
	// 	 return str1.replace("x", ""); // output = hi
	// }

	//      String Withoutx3(){
	// 	 Scanner in2 = new Scanner(System.in);
	// 	 System.out.println("Enter a string xxxworxld is ");
	// 	 String str2 = in2.next(); // input "xxxworxld" 
	// 	 return str2.replaceFirst("xxx", ""); // output = worxld
	// }

	//      String Withoutx4(){
	//      Scanner in3 = new Scanner(System.in);
	// 	 System.out.println("Enter a string xxx worxld is "); // input xxx worxld
	// 	 String str3 = in3.next();
 //         return str3.substring(str3.indexOf(' '),str3.length()); // output = worxld
	// }

	//      String Withoutx5(){
 //         Scanner in4 = new Scanner(System.in);
	// 	 System.out.println("Enter a string xxCDEF is "); // input xxCDEF
	// 	 String abd = in4.next();
	// 	 System.out.println("Enter a String x ");
	// 	 String guess = in4.next();
 //         return (abd.replaceAll(String.join( "",guess.split("")), "")); // output = CDEF
 //                        }

         public static String removeSpaces(){
         Scanner console = new Scanner(System.in);
		 System.out.println("enter String1 is : ");
		 String str = console.nextLine();
		 String ourString="";
		     int j = 0;
		     for (int i=1; i<str.length()-1 ; i++){
		        j = i+1;
		        if(str.charAt(i)!=str.charAt(j)){
		            ourString+=str.charAt(i);
		        }
		    }
		    return ourString;
		    }
	
	       }

