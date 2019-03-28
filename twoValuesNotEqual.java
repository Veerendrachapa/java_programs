import java.util.Scanner;

public class twoValuesNotEqual {
	boolean getoutput(String s1, String s2){
 	  
	if(s1.equals(s2)) {
		return true;
 	   }
     return false;
	}
 	  
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	       String s1 = sc.next();
	       String s2 = sc.next();
          
	       
           twoValuesNotEqual obj = new twoValuesNotEqual();
	        if( obj.getoutput(s1,s2)) {
	       
	       System.out.println("Two values are equal");  
	        }
	        else {
	        	 System.out.println("Two values are not equal");  
	        }
	}

}