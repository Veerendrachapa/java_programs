package feb22ifelse;

import java.util.Scanner;

public class PassOrFail {
	Scanner sc = new Scanner(System.in);
	int sub1 = sc.nextInt();
	int sub2 = sc.nextInt();
	int sub3 = sc.nextInt();
	int sub4 = sc.nextInt();
	int sub5 = sc.nextInt();
	
	
	
	int total() {
//		int total1 = ;
		System.out.println("Student total marks ");
		return sub1+sub2+sub3+sub4+sub5;
	}
	
	int avg() {
//		int avg1 = (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Student avg marks ");
		return (sub1+sub2+sub3+sub4+sub5)/5;
	}
	
	boolean studentpass() {
	if (sub1 > 35 && sub2 > 35 && sub3 > 35 && sub4 > 35 && sub5 > 35) {
		System.out.println("Student pass the exams");
		return true;
     	}
	       return false;
//		else {
//		System.out.println("Student Fail the Exams");
//	}	
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	
	PassOrFail sp = new PassOrFail();
	
   System.out.println( sp.total());
   
    System.out.println(sp.avg());

    System.out.println(sp.studentpass());

	}

}
