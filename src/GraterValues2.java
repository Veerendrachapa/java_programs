import java.util.*;
class GraterValues2{
	public static boolean abValue(int a,int b){
		if(a==b){
			return true;
		}
		return false;
	}
	public static boolean cdValue(int a,int b,int c,int d){
		if((c>a && d>a)&&(c>b && d>b)){
			return true;
		}
		return false;
	}
	public static boolean dValue(int c,int d){
		if(d>c ){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		System.out.println("Enter a and b value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(abValue(a,b)){
			System.out.println("a and b are equal");
			System.out.println("Enter c and d values");
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(cdValue(a,b,c,d)){
				System.out.println("c and d values are greater then a and b");
			
			  if(dValue(c,d)){
				  System.out.println("d is greater than c");
			   }
			   else{
				  System.out.println("c is greater than d");
			    }
			}
			else{
				System.out.println("But a and b are greater then both c and d");
			}
		}
		else{
			System.out.println("a and b are not equal");
		}
	}
}