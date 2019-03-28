import java.util.Scanner;

public class NegativeOrPositiveOrZero{

        void positive(int num1){
        	if(num1>=0){
        		System.out.println("It is a positive number");
        	}
        	if(num1<0){
        		System.out.println("It is a negitive number");
        	}
        	if(num1 == 0){
        		System.out.println("It is zero number");
        	}
        }

        

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number is = ");
		int num1 = sc.nextInt();
		 
        NegativeOrPositiveOrZero obj = new NegativeOrPositiveOrZero();
        
        obj.positive(num1);
       

	}
}