package basicJavaProgram;

import java.util.Scanner;

public class NumberPrime {
	
	public static void main (String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		
		
		
		int num=scan.nextInt();
		int tem=0;
		
		
		for (int b=2; b<=num-1; b++)
		{
			if (num%b==0)
			{
				tem=+1;
			}
		}
		if(tem==0)
		{
			System.out.println(num+ " is prime number");
		}
		else
		{
			System.out.println(num+ " is not prime number");
		}
			
		
		
			
			
		
		
	}

}
