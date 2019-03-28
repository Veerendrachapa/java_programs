import java.util.*;
class Program5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int value1 = s.nextInt();
		int value2 = s.nextInt();

		if (value1<value2){
			System.out.println("maximum number "+value2);

		}
		if(value1>value2){
			System.out.println("maximum number "+value1);
		}

	}
}