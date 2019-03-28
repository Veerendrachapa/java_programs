// 2. Write a program to print output in nested if condition?

// Input: a = 10 b = 10 c = 15 d = 20  
// Output:  a == b are equal  
// c and d values are greater  than a and b.
 // d is greater than c. 

// Input: a = 10 b = 10 c =6 d =5 
// Output:  a and b are equal 
// But a and b are greater than both c and d. 
// c is greater than b

// Input: a = 10 b = 20 c =10 d =7 
// Output:  a and b are not equal.
import java.util.Scanner;
public class GraterValues1 {
	public static void main(String [] args){
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a2 = 10 value is  : ");
		int a2 = sc2.nextInt();
		System.out.println("Enter b2 = 20 value is : ");
		int b2 = sc2.nextInt();
		
		if(checkANotequalB(a2,b2)){
			
	      if(a2!=b2){
	      	System.out.println("a2 and b2 are not equal");
	      }
	      else {
	    	  System.out.println("a2 and b2 are equal");
	      }
		}
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = 10 value is : ");
		int a = sc.nextInt();
		System.out.println("Enter b = 10 value is : ");
		int b = sc.nextInt();
		if(a!=b) {
			System.out.println("a equal b");
		}
		System.out.println("Enter c = 15 value is : ");
		int c = sc.nextInt();
		System.out.println("Enter d = 20 value is : ");
		 int d = sc.nextInt();
		
		if(checkAequalB(a,b,c,d)){
             	 if (a <= b && c>a && c>b && d>a && d>b) {
             		System.out.println("c and d are greater then both a and b");
             	 }
             	else{
                    System.out.println("a and b are not equal");
           		}
             	 if(d>c){
             		System.out.println("d is greater than c");
             	 }
             	 
		else{
         System.out.println("a and b are not equal");
		}
			
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter a1 = 10 value is : ");
			int a1 = sc1.nextInt();
			System.out.println("Enter b1 = 10 value is : ");
			 int b1 = sc1.nextInt();
			System.out.println("Enter c1 = 6 value is : ");
			int c1 = sc1.nextInt();
			System.out.println("Enter d1 = 5 value is : ");
			int d1 = sc1.nextInt();
			if(checkAequalB1(a1,b1,c1,d1)){
				if(a1==b1){
                 	System.out.println("a1 and b1 are equal");
                 }
				else {
					System.out.println("a1 and b1 are not equal");
				}
                 	 if(a1 == b1 && c1<a1 && c1<b1 && d1<a1 && d1<b1){
                 		System.out.println("a1 and b1 are greater than both c1 and d1");
                 	}
                 		 if(c1<b1){
                 			System.out.println("c1 is grater than b1");
                 		}
                 	}
                 }
				else{
                    System.out.println("invalid input");
				}
	      }
		
	
	            
public static boolean checkANotequalB(int a2, int b2){	
		
		if(a2!=b2) return true;
		return false;
	}	
	
    public static boolean checkAequalB(int a, int b,int c, int d){	
		
		 if(a <= b && c>a && c>b && d>a && d>b) return true;
		 if(d>c) return true;
		return false;
	}
	
	public static boolean checkAequalB1(int a1, int b1, int c1, int d1){
		
		 if(a1 <= b1 && c1<a1 && c1<b1 && d1<a1 && d1<b1) return true;
		 if(b1>c1) return true;
		return false;
	}
    
	
}


