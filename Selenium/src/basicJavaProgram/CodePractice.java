package basicJavaProgram;

import java.util.Scanner;

public class CodePractice {

	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num=scan.nextInt();
		int tem=0;
		for(int i=2; i<=num-1;i++)
		{
			if (num%i==0)
			{
				tem=tem+1;
			}
		}
		if (tem==0)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
	}
}