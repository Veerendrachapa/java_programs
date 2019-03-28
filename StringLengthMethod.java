import java.util.*;
public class StringLengthMethod {
	public static void main(String[] args) {
			StringLengthMethod obj = new StringLengthMethod();
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter first string : ");
	        String a = sc.next().toLowerCase();
	        System.out.println("Enter second string : ");
	        String b = sc.next().toLowerCase();
             obj.lengthMethod(a,b);
             System.out.println("***********************************************/n");
             obj.lexicographically(a, b);
		}

		public void lengthMethod(String a, String b){
			int lenD = a.length();
			int lenE = b.length();
	        
	        int lenF = (a.length()+b.length());
	        System.out.println(lenF);
	        if(lenD>lenE) {
	        	System.out.println("No");
	        }
	        System.out.println(a+" "+b); 
	     
		}
		
		   
		
		public void  lexicographically(String a, String b) {
		System.out.println("There are three lines of output: ");
		int lenD = a.length();
		int lenE = b.length();
		
		int lenF = (a.length()+b.length());
		System.out.println("For the first line, sum the lengths of A and B: "+lenF);
		
         //For the second line, write Yes if A is lexicographically greater than B otherwise print No instead. 

		 int result = a.compareTo(b);

	        // Display the results of the comparison.
	        if (result < 0)
	        {
	            System.out.println("\"" + a + "\"" +
	                " is less than " +
	                "\"" + b + "\"");
	        }
	        else if (result == 0)
	        {
	            System.out.println("\"" + a + "\"" +
	                " is equal to " +
	                "\"" + b + "\"");
	        }
	        else // if (result > 0)
	        {
	            System.out.println("\"" + a + "\"" +
	                " is greater than " +
	                "\"" + b + "\"");
	        }
		

		System.out.println("For the third line, capitalize the first letter in "
				+ "both A and B :"+a+" "+b);
		}
		
	}


