package ifelseif;

import java.util.Scanner;

public class CalculateBasicSalaryAndGrossSalaryOfAnEmployee {
	
	static float da;
	static float hra;
	static float da1;
	static float hra1;
	static float da2;
	static float hra2;
		
		void  display(float basicsalary, float da, float hra, float da1, float hra1, float da2, float hra2) {
		
			 hra = basicsalary *(20/100);
			 da = basicsalary *(80/100);
			
			 hra1 = basicsalary *(25/100);
			 da1 = basicsalary *(90/100);
			
			 hra2 = basicsalary *(30/100);
			 da2 = basicsalary *(95/100);
			
			float gross_sal = basicsalary+da+hra;
			float gross_sal1 = basicsalary+da1+hra1;
			float gross_sal2 = basicsalary+da2+hra2;
			
			
			if(basicsalary<=10000) {
				System.out.println("Gross salary of employee = "+gross_sal);
			}
			else if(basicsalary<=20000) {
				System.out.println("Gross salary of employee1 = "+gross_sal1);
			}
			else if(basicsalary>20000) {
				System.out.println("Gross salary of employee2 = "+gross_sal2);
				
			}
			else {
				System.out.println("Invalid input enterd");
			}
			
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("program Number 7- a program to calculate basic salary and gross salary of an employee");
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee basic salary");
			float basicsalary = sc.nextFloat();
			
		
			
//			System.out.println("Employee da");
//			float da = sc.nextFloat();
//			System.out.println("Employee hra");
//			float hra = sc.nextFloat();
				CalculateBasicSalaryAndGrossSalaryOfAnEmployee bsgs = new CalculateBasicSalaryAndGrossSalaryOfAnEmployee();
				
				bsgs.display(basicsalary, da, hra, da1, hra1, da2, hra2);
				
//				da 10% = (10/100) = 0.1
			}

		}
		
