import java.util.Scanner;

public class Proifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int personCheck=s.nextInt();

		if(personCheck <=18)
		{
			System.out.println("Person is not eligible for government job");
		}
		else if(personCheck >18 && personCheck < 35)
		{
			System.out.println("Person is eligible for government job");
		}
		else
		{
			System.out.println("Person age is expired for applying the government job");
		
				}

	}

}
