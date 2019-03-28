import java.util.*;

class Pro7{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int value1 = s.nextInt();
		
		if (value1<12){
			System.out.println("Good Morning");
		}
		int value2 = s.nextInt();
		if(value2 >12 && value2 <18){
			System.out.println("Good Afternoon");
		}
		int value3 = s.nextInt();
		if(value3 >18 && value3<24){
			System.out.println("Good Night");
		}
	}
}