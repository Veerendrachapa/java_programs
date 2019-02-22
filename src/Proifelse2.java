import java.util.Scanner;

public class Proifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int majorCheck=s.nextInt();

		if(majorCheck <=18)
		{
			System.out.println("Person is Minor");
		}
		else
		{
			System.out.println("Person is Major");

				}
	}

}
