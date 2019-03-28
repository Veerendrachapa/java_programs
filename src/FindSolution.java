import java.util.Scanner;

//  class UserData {

// 	static final String userName = "java";
// 	static final String password = "java123";
// }

public class FindSolution {
	static Scanner scan = new Scanner(System.in);

	    public static void main(String [] args){
	    	// Scanner scan = new Scanner(System.in);
		 // UserData  UserData = new UserData(); 
		System.out.println("Enter username");
		

	 String username = scan.nextLine(); 

		System.out.println("Enter password");
	 String password = scan.nextLine(); 
         FindSolution obj = new FindSolution(); 

        
		if (obj.checkUserName(username))
			if (obj.checkUserPassword(password))
				System.out.println("Login successfull");
			else
				System.out.println("Check password");
		else
			System.out.println("Check username");
		
		
		scan.close();

		

	}

	

	       private boolean checkUserName(String str) {

		if (str.equals(UserData.userName)) {
			return true;
		}
		return false;
	}

	

	private boolean checkUserPassword(String str) {

		if (str.equals(UserData.password)) {
			return true;
		}
		return false;
	}
   
}

