public class PentagonalNumber
{
	public static void main(String[] args)
	{
      for (int n = 1 ; n <= 10 ; n ++ )
      {
         System.out.print(getPentagonalNumber(n) + "   ");
      }
	}

	public static int getPentagonalNumber(int num)
	{
      int result;
      result = num * (3 * num - 1) / 2;
      return result;
	}
}
