import java.util.Scanner;
public class Triangle
{
   public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
      int num, row, col, space;

		System.out.print("Please enter a number from 1 - 9: ");
		num = input.nextInt();
      
      if (num < 0 || num > 9)
      {   
         System.out.println("The number must be 1-9"); 
      }
      else
      {
		   for (row = 1; row <= num; row ++)
         {
            for (space = num - row; space >= 1; space--)
            {
               System.out.print(" ");
            }
            for (col = 1; col <= row; col++)
            {
               System.out.print(col);
            }
            System.out.println("");
         }
      }
      input.close();
   }
}
