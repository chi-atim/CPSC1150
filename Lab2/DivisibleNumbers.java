import java.util.Scanner;

public class DivisibleNumbers
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int num1, num2;
      
      System.out.print("Enter a positive integer number: ");
      num1 = scanner.nextInt();
      System.out.print("Enter a positive integer number: ");
      num2 = scanner.nextInt();
     
      if (num1 < 0 || num2 < 0)
      {
         System.out.println("Error: Expecting a positive number");
      }
     
      else if (num1 < num2)
      {
         System.out.println("Error: First number must be bigger than the second number");
      }
      
      else if (num1 % num2 != 0)
      {
         System.out.println(num1 + " is not divisible by "+ num2);
      }
      else
      {
         System.out.println(num1 + " is divisible by " + num2);
      }

      scanner.close();
      
   }
}
