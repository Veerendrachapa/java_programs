import java.util.*;
public class ShortLongStringsConcat {

	public static void main(String [] args){
		ShortLongStringsConcat obj = new ShortLongStringsConcat();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String s1 = sc.next();
		System.out.println("Enter second String : ");
		String s2 = sc.next();

		System.out.println(obj.comboString(s1,s2));

	}

	public String comboString(String s1,String s2){
		int lenD = s1.length();
		int lenE = s2.length();

		if(lenD>lenE){
			return s2+s1+s2;
		}
		else{
			return s1+s2+s1;
		}
	}
}
