
import java.util.Scanner;
class UserData {

	public static  String userName = "java";
	public static  String password = "java123";
	public static String password1;
	public static String userName1;
	
}

public class FindSolution1 {
	
		static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			 UserData  UserData = new UserData(); 
			System.out.println("Enter username");
			String username = scan.nextLine();

			System.out.println("Enter password");
			String password = scan.nextLine();

			if (checkUserName(username))
				if (checkUserPasswor(password)) {

					System.out.println("Login successfull");
					System.out.println("-----------------");
					System.out.println("Enter 1. Change username");
					System.out.println("Enter 2. Change password");

					float f = scan.nextFloat(); //float f = scan.nextDouble --> bug 1
					if (f == 1) {
						System.out.println("Enter desired username");
						String newUserName = scan.nextLine();

						System.out.println("Username change from " + username + "to " + newUserName + " successfully");

					} else if (f == 2) {
						System.out.println("Enter desired password");
						String newUserName = scan.nextLine();

						String newUserName1 = changeUsername(password);
						System.out.println("Username change from " + password + " to " + newUserName1 + " successfully");

					} else
						System.out.println("please check your input...");
				} else
					System.out.println("Check password");
			else
				System.out.println("Check username");
		}

		private static boolean checkUserName(String str) {

			if (str.equals(UserData.userName)) {
				return true;
			}
			return false;
		}

		private static boolean checkUserPasswor(String str) {

			if (str.equals(UserData.password)) {
				return true;
			}
			return false;
		}

		private static String changePassword(String oldPass) {
			UserData.password = oldPass; //UserData.password = newUserName;
			return "oldPass";
		}

		private static String changeUsername(String oldUsername) {
			UserData.userName = oldUsername; // UserData.userName = newUserName;
			return "oldPass";
		}
	}



