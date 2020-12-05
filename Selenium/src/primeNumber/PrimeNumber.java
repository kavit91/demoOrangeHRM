package primeNumber;

public class PrimeNumber {
		public static void main(String[] args) {
			
			for (int i=1; i<=100;i++)     
			{
				int tem=0;
				for (int j=2; j<=i/2;j++)     
				{
					if (i%j==0)              
					{
						tem=+1;
					}
				}
				
				if (tem==0 && i!=1)
				{
					System.out.println(i);
				}
			}
		}

}


