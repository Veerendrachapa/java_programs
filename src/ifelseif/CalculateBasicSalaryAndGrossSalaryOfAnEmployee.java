package ifelseif;

import java.util.Scanner;

public class CalculateBasicSalaryAndGrossSalaryOfAnEmployee {
		
		void  display(float basicsalary, float da, float hra) {
		
			float gross_sal = basicsalary+da+hra;
			
			if(basicsalary<=10000) {
				System.out.println("Gross salary of employee = "+gross_sal);
			}
			else if(basicsalary<=20000) {
				System.out.println("Gross salary of employee = "+gross_sal);
			}
			else if(basicsalary>=35000) {
				System.out.println("Gross salary of employee = "+gross_sal);
				
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
			System.out.println("Employee da");
			float da = sc.nextFloat();
			System.out.println("Employee hra");
			float hra = sc.nextFloat();
				CalculateBasicSalaryAndGrossSalaryOfAnEmployee bsgs = new CalculateBasicSalaryAndGrossSalaryOfAnEmployee();
				bsgs.display(basicsalary,da,hra);
				
//				da 10% = (10/100) = 0.1
			}

		}
		
