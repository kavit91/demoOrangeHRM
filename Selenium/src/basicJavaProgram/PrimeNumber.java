package basicJavaProgram;

public class PrimeNumber {

	public static void main(String []args)
	{
		
		for(int i=2; i<=100; i++)
		{
			int tem=0;
			for (int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}
			}
			if(tem==0)
			{
					System.out.println(i);
			}
		}
		
	}
}
