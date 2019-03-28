import java.util.*;
class Pro6{
	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		int value1 = s.nextInt();

        if(value1>0){
        	System.out.println("Positive Number");
        }
        int value2 = s.nextInt();
        if(value2==0){
        	System.out.println("zero Number");
        }
        int value3 = s.nextInt();
        if(value3<0){
        	System.out.println("Negitive Number");
        }
	}
}