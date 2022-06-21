package CPSC1150.Lab1;

import java.util.Scanner;

public class Cylinder 
{
   public static void main(String[] args)
   {
      // Create a Scanner object
      Scanner scanner = new Scanner(System.in);
      
      // Prompt the user to enter a radius and a length
      System.out.print("Enter the radius of a cylinder: ");
      double radius = input.nextDouble();
      System.out.print("Enter the length of a cylinder: ");
      int length = input.nextInt();
      
      // Compute area
      double area = radius * radius * Math.PI;
      double volume = area * length;
      
      // Display results
      System.out.println("The volume of a cylinder is " + volume);

      scanner.close();
   }
}
