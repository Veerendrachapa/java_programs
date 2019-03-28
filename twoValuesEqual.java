import java.util.Scanner;

public class twoValuesEqual {
	boolean getoutput(String s1){
 	  
	if(s1.equals("abc")) {
		return true;
 	   }
     return false;
	}
 	  
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	       String s1 = sc.next();
           twoValuesEqual obj = new twoValuesEqual();
	        if( obj.getoutput(s1)) {
	       
	       System.out.println("Two values are equal");  
	        }
	        else {
	        	 System.out.println("Two values are not equal");  
	       }
	}
}