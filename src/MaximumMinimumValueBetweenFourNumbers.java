// 4. Write a program to print maximum value in minimum value between four numbers using nested if?

// Input:  a : 10 b : 25 c : 27 d : 30  
// Output:  
// 30 is the biggest number  
// 10 is the lowest number

import java.util.Scanner;

public class MaximumMinimumValueBetweenFourNumbers {

	void minimum(int a,int b,int c,int d)
	{
		if(a<b)
		{
			if(a<c)
			{
				if(a<d)
				{

					System.out.println(a+" is minimum number among given four");
				}
				else
				{
					System.out.println(d+" is minimum number among given four");
				}
			}
			else
			{
				if(c<d)
				{
					System.out.println(c+" is minimum number among given four");
				}
				else
				{
					System.out.println(d+" is minimum number among given four");
				}
			}
		}
		else
		{
			if(b<c)
			{
				if(b<d)
				{
					System.out.println(b+" is minimum number among given four");
				}
				else
				{
					System.out.println(d+" is minimum number among given four");
				}
			}
			else
			{
	            if(c<d)
				{
					System.out.println(c+" is minimum number among given four");
				}
				else
				{
					System.out.println(d+" is minimum number among given four");
				}
			}
		}		
	}
	void maximum_and_minimum(int a,int b,int c,int d)
    {
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a+" is maximum number among given four");
				}
				else
				{
					System.out.println(b+" is maximum number among given four");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+" is maximum number among given four");
				}
				else
				{
					System.out.println(d+" is maximum number among given four");
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(b+" is maximum number among given four");
				}
				else
				{
					System.out.println(d+" is maximum number among given four");
				}
			}
			else
			{
	            if(c>d)
				{
					System.out.println(c+" is maximum number among given four");
				}
				else
				{
					System.out.println(d+" is maximum number among given four");
				}
			}
		}
		minimum(a,b,c,d);
	}
	public static void main(String args[])
	{
		MaximumMinimumValueBetweenFourNumbers o1=new MaximumMinimumValueBetweenFourNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = 10 value is: ");
		int a = sc.nextInt();
		System.out.println("Enter b = 45 value is: ");
		int b = sc.nextInt();
		System.out.println("Enter c = 56 value is: ");
		int c = sc.nextInt();
		System.out.println("Enter d = 9 value is: ");
		int d = sc.nextInt();
		o1.maximum_and_minimum(a,b,c,d); // 10,45,56,9
	}
}


