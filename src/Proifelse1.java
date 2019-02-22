import java.util.Scanner;

public class Proifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int numberToCheck=s.nextInt();

		if(numberToCheck % 2==0)
		{
			System.out.println(numberToCheck +" is an even number");
		}
		else
		{
			System.out.println(numberToCheck +" is an odd number");
		
		
		}
	}
}
