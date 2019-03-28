import java.util.Scanner;

public class AgeBasedIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter income");
		int income = sc.nextInt();
		
		if(age(age,income)) {
			System.out.println("income tax percentage is: 0%");
			if(age<60 &&(income> 25000 && income<50000 )) {
				System.out.println("income tax percentage is: 0.1%");
				
				if(age<60&&(income>50000 && income<100000)) {
					System.out.println("income tax percentage is: 0.2%");
					
					if(age<60 && income>100000) {
						System.out.println("income tax percentage is: 0.3%");
					}
					else {
						System.out.println(" false condition income tax percentage is: 0.4%");
					}
				}
				else {
					System.out.println(" false condition income tax percentage is: 0.5%");
				}
			}
			else {
				System.out.println(" false condition income tax percentage is: 0.6%");
			}
		}
		else {
			if(income(age,income)) {
				System.out.println("income tax percentage is: 0%");
				if((age > 60 && age < 80) && (income > 300000 && income < 500000 )) {
					System.out.println("income tax percentage is: 0.1%");
					if((age > 60 && age < 80) && (income > 500000 && income < 1000000 )) {
						System.out.println("income tax percentage is: 0.2%");
						if((age > 60 && age < 80) && (income > 1000000)) {
							System.out.println(" income tax percentage is: 0.3%");
						}
						else {
							System.out.println(" false condition 1 income tax percentage is: 0.4%");
						}
					}
					else {
						System.out.println(" false condition 1 income tax percentage is: 0.5%");
					}
				}
				else {
					System.out.println(" false condition 1 income tax percentage is: 0.6%");
				}
			}
		}
		 if(income1(age,income)) {
			 System.out.println(" income tax percentage is: 0%");
			 if((age>80)&& (income> 500000 && income < 1000000 )) {
				 System.out.println(" income tax percentage is: 0.2%");
				 if(age>80 && income>1000000) {
					 System.out.println(" income tax percentage is: 0.3%");
				 }
				 else {
						System.out.println(" false condition 2 income tax percentage is: 0.4%");
					}
			 }
			 else {
					System.out.println(" false condition 2 income tax percentage is: 0.5%");
				}
		 }
		 else {
				System.out.println(" false condition 2 income tax percentage is: 0.6%");
			}
	}
public static boolean age(int age, int income) {
	if(age<60 && income<25000) return true;
	return false;
}
public static boolean income(int age, int income) {
	if( (age > 60 && age < 80) && (income < 300000 ) ) return true;
	return false;
}
public static boolean income1(int age, int income) {
	if((age>80) && income < 500000) return true;
	return false;
}
}
