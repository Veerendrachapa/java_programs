package feb22ifelse;

import java.util.Scanner;

public class PersonIsMajorMinor {
	
	Scanner sc = new Scanner(System.in);
	int majorOrMinor = sc.nextInt();
	
	boolean majororminor() {
		if(majorOrMinor<18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonIsMajorMinor mn = new PersonIsMajorMinor();
		if(mn.majororminor()) {
			System.out.println("person is Minor");
		}
		else {
			System.out.println("person is Major");
		}

	}

}
