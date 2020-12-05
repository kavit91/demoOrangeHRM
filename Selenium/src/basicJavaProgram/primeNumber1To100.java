package basicJavaProgram;


public class primeNumber1To100 {

	public static void main(String [] args)
	{
		
		for(int i=1; i<=150;i++)
		{
			int tem=0;
			for (int j=2; j<=i-1; j++)
			{
				if (i%j==0)
				{
					tem=+1;
				}
			}
			if (tem==0)
			{
				System.out.println(i);
			}
			else
			{
				tem=0;
			}
		}
	}	
}
