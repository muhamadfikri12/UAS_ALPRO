public class No6_Contoh3 {
	public static void main(String args[])
	{
		int i, j; 
		int n = 9;
		for (j = 1; j<= n; j++)
		{
			for (i = 1; i<= n; i++)
			{
				System.out.print(" ");
			}
			n--;
			for (i = 1; i <= 2 * j - 1; i++)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
