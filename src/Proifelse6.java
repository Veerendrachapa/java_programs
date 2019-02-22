

public class Proifelse6 {
	
		int a = 70;
		int b = 75;
		int c = 70;
		int d = 80;
		int e = 30;
		
		int total() {
//			int total1 = ;
			System.out.println("Student total marks ");
			return a+b+c+d+e;
		}
		
		int avg() {
//			int avg1 = (a+b+c+d+e)/5;
			System.out.println("Student avg marks ");
			return (a+b+c+d+e)/5;
		}
		
		boolean studentpass() {
		if (a > 35 && b > 35 && c > 35 && d > 35 && e > 35) {
			System.out.println("Student pass the exams");
			return true;
         	}
		       return false;
//			else {
//			System.out.println("Student Fail the Exams");
//		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proifelse6 sp = new Proifelse6();
		System.out.println(sp.studentpass());
       System.out.println( sp.total());
        System.out.println(sp.avg());
	}

}
