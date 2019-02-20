import java.util.Scanner;

public class Proifelse12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the input ");
		if(s.hasNextInt()) {
			System.out.println("Entered input is integer");
		}
		else if(s.hasNext()) {
			String a = s.nextLine();
			if(a.length()>1) {
				System.out.println("Entered input is String");
			}
			else if(s.hasNext()) {
				char ch = s.next().charAt(0);
				System.out.println("Enter input is character");
			}
		}
		
			}
		
		}

	


