
import java.util.Scanner;

public class temparature {

	void getoutput(int temp){

		if(temp<=15){
			System.out.println("it's too cold outside. wear weather jacket");
		}
		if(temp>=20 && temp<=25){
			System.out.println("Room temparature");
		}
		if(temp>=26 && temp<=40){
			System.out.println("It's hot outside. Apply sunscreen lotion");
		}
		if(temp>=41 && temp<=45){
			System.out.println("It's hot outside. take umbrella with you");
		}

	}


public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();

    temparature obj = new temparature();
    obj.getoutput(temp); 

}
}