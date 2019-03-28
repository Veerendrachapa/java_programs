import java.util.Scanner;

public class avgValues{
      
      // static void getoutput(int sub1, int sub2, int sub3){
	    void getoutput(int sub1, int sub2, int sub3){
      	if(sub1>0 && sub2>0 && sub3>0){
      	int total = sub1+sub2+sub3;
      	int avg = (total/3);
      	System.out.println("Student total marks " +total+ " Avg of three subjects " +avg);
      }
}


	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();

		 avgValues obj = new avgValues();

		 obj.getoutput(sub1,sub2,sub3);

		// getoutput(sub1,sub2,sub3); // if use static object not use in method
	}
}