package ifelseif;

import java.util.Scanner;

public class CalculatePercentageAndGrade {
	static int persentage,sub1,sub2,sub3,sub4,sub5,total;
	 
	static void student(int persentage){
		if(persentage >= 90) {
			System.out.println("Grade A");
		}
		else if(persentage >= 80 && persentage <= 90) {
			System.out.println("Grade B");
		}
		else if(persentage >=70 && persentage <=80){
			System.out.println("Grade C");
		}
		else {
			System.out.println("Student fail the exam");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 6- a program to calculate percentage and grade of a student");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sub1 marks is ");
		 sub1 = sc.nextInt();
		 System.out.println("Enter a Sub2 marks is ");
		 sub2 = sc.nextInt();
		 System.out.println("Enter a Sub3 marks is ");
		 sub3 = sc.nextInt();
		 System.out.println("Enter a Sub4 marks is ");
		 sub4 = sc.nextInt();
		 System.out.println("Enter a Sub5 marks is ");
		 sub5 = sc.nextInt();
		 
		 total = sub1+sub2+sub3+sub4+sub5;			
		 persentage = (total*100)/500;	
		 CalculatePercentageAndGrade cpg = new CalculatePercentageAndGrade();
		 cpg.student(persentage);

	}
}


