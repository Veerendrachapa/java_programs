/*3. Write a program to check whether given number is even using if condition?
input : 2
Output : Even Number
*/

import java.util.Scanner;

public class GivenNumberIsEven {

	static void even(int number) {
		if (number % 2 == 0) {
			System.out.println("Number is even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Number 3-check whether given number is even using if condition");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		GivenNumberIsEven nie = new GivenNumberIsEven();
		nie.even(number);

	}

}
