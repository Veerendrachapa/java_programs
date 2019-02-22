package proif;
import java.util.Scanner;
public class Proif9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     int firstValue = s.nextInt();
	     int secondValue = s.nextInt();
	     int thirdValue = s.nextInt();
		if (firstValue>0 && secondValue>0 && thirdValue>0){
			int avgOfThreeValues = (firstValue+secondValue+thirdValue)/3;
			System.out.println("Avg of three values is "+avgOfThreeValues);
		}
	}
}
