package feb22;

import java.util.Scanner;

public class AverageOfThreeSubjects {
	
	static int sub1,sub2,sub3;
	
	int totel() {
		System.out.println("Student total marks ");
		return sub1+sub2+sub3;
	}
	
	int avg() {
		return (sub1+sub2+sub3)/3; 
	}
	
	/*
	 * boolean threesubjects() { if(sub1>0 && sub2>0 && sub3>0) { return true; }
	 * return false; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sub1 ");
        sub1 = sc.nextInt();
        System.out.println("Enter the sub2 ");
        sub2 = sc.nextInt();
        System.out.println("Enter the sub3 ");
        sub3 = sc.nextInt();
        
        AverageOfThreeSubjects subjects = new AverageOfThreeSubjects();
        
        System.out.println("total 3 sub marks are "+subjects.totel());
        System.out.println("three subjects avg "+subjects.avg());
        
		/*
		 * if(subjects.threesubjects()) {
		 * System.out.println("Student pass the 3 subjects"); }
		 */
	}

}
