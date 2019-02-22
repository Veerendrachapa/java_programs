package feb22ifelse;

import java.util.Scanner;

public class GovernmentJob {
	
	Scanner s=new Scanner(System.in);
	int personCheck=s.nextInt();
	
	boolean notEligibleForGovernmentJob(){
		if(personCheck <=18) {
			return true;
		}
            return false;
	}
	
	boolean eligibleForGovenmentJob() {
		if(personCheck >18 && personCheck < 35) {
			return true;
		}
		return false;
	}
	
	boolean personIsold() {
		if(personCheck >35 && personCheck < 65) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GovernmentJob gj = new GovernmentJob();
		
		

		if(gj.notEligibleForGovernmentJob())
		{
			System.out.println("Person is not eligible for government job");
		}
		 if(gj.eligibleForGovenmentJob())
		{
			System.out.println("Person is eligible for government job");
		}
		 if(gj.personIsold()) {
			 System.out.println("person is old");
		 }
		
	}

}
