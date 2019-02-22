package feb22;

import java.util.Scanner;

public class checkWhetherGivenNumberIsEven {
	Scanner sc = new Scanner(System.in);
	byte givenNumberIsEven = sc.nextByte();
	
	boolean whetherGivenNumberIsEven() {
		if(givenNumberIsEven % 2 == 0) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkWhetherGivenNumberIsEven cwge = new checkWhetherGivenNumberIsEven();
		 if(cwge.whetherGivenNumberIsEven() ){
             
             System.out.println(" Given Number is even");
       }
       else{
             System.out.println(" Given Number is not a even");
       }
//		System.out.println(cwge.whetherGivenNumberIsEven());
//        System.out.println("Given Number is Even ");
	}

}
