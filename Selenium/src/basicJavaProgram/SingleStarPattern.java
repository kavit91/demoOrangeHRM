package basicJavaProgram;

public class SingleStarPattern {
	public static void main(String []args)
	{
	for( int i=1; i<=5; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}   // this is my way but incorrect
	
	
	for( int i=1; i<=4; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
}
}
