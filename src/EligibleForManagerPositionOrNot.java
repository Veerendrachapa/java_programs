//3.Write a program to print whether he/she eligible for manager position or not? 

//Note: j- Junior, s- Senior Manager, a- Asst. Manager here characters are not a case sensitive 

//Input: 
//Enter years of experience: 11  
//Enter the number of training received: 6  
//Enter your current post: a 
//Output :  
//Qualified to be promoted to Manager  


//if exp is > 10 and a train is > 5 and post is j or s 
//Output:​ 
//Become assistant manager first                 
//Need more training                
//Need more experience  


//if exp is > 10 and a train is < 5 and the post is j or s 
//Output:​ 
//Need more training               
//Need more experience  


//if exp is > 10 and a train is < 5 
//Output:​ 
//Need more training               
//Need more experience  


//if exp is < 10
//Output:​ Need more training  


import java.util.Scanner;
public class EligibleForManagerPositionOrNot {
public static void main(String [] args){
			EligibleForManagerPosition();
		}
			 private static void EligibleForManagerPosition() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter person years of experience = 4 : ");
			int experience = sc.nextInt();
			 if(personNeedToTraining(experience)) {
				 System.out.println("Need more training");
					System.out.println("Enter  the number of training received = 2 to 4 : ");
					int training = sc.nextInt();
				if(personNeedToMoreTraining( experience,training)){
						 System.out.println("Need more training");
						 System.out.println("Need more experience");
							System.out.println("Enter your current post = j or s : ");
							 String post = sc.next();
						if(PersonNeedToMoreExperience(experience,training, post)){
							 System.out.println("Need more training ");
							 System.out.println("Need more experience ");
							 
							 if(PersonEligibleAssistantManager( experience,training,post)) {
								 System.out.println(" Become assistant manager first");
								 System.out.println("Need more training ");
								 System.out.println("Need more experience ");
								 
								
								 if(personeligibleManager( experience,training, post)) {
									 System.out.println("Qualified to be promoted to Manager ");
								 }
								 else {
									 System.out.println("person need more Experience");
								 }
							 }
								 
							 else {
								 System.out.println("person need more training");
							 }
							 }
							 
							 
						 else {
							 System.out.println("Qualified to be junior Manager "); 
						 }
						 }		
					 
					 else {
						 System.out.println(" Become junior assistant manager first");
						 System.out.println("Need more training ");
						 System.out.println("Need more experience "); 
					 }
				 }
			 
			 else {
				 System.out.println("Need more training");
				 System.out.println("Need more experience "); 
			 }
			 
			 }
			
			 public static boolean personeligibleManager(int experience,int training, String post) {
				 if(experience >10 && training >5 && post.equals("a")) return true;
						 return false;
			 }
			 public static boolean PersonEligibleAssistantManager(int experience,int training, String post) {
				 if(experience >10 && training >5 && post.equals("j") || post.equals("s"))  return true;
				 return false;
			 }
			 public static boolean PersonNeedToMoreExperience(int experience,int training, String post) {
				 if(experience >10 && training <5 && post.equals("j") || post.equals("s")) return true;
				 return false;
			 }
			 public static boolean personNeedToMoreTraining(int experience, int training) {
				 if(experience >10 && training <5) return true;
				 return false;
			 }
			 public static boolean personNeedToTraining(int experience) {
				 if(experience<10) return true;
				 return false;
			 }
}