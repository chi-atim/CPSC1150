/**
**Program Name: StockSale
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor : Hengameh Hamavand
**Date: September 16th, 2018
*/

import java.util.Scanner; // Import java.util package

public class StockSale 
{
	/**This StockSale program will calculate the value of the shares, the commission and the net proceeds.
	*/	
   public static void main(String[] args)
   {
	   //Declare strings
	   String stars = "***************************************************";
	   String line = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
	   
	   // Display introduction
	   System.out.println(stars);
	   System.out.println("This program calculates the net proceeds from a sale of stock.");
	   System.out.println(line);
	   
	    //Declare all numbers to be double variable
	   double price, shares, rate, value, com, net;
	   
      // Scanner object
	   Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a stock price, a number of shares and commission rate
	   System.out.print("Enter the stock price: $");
	   price= input.nextDouble();
	   System.out.print("Enter number of shares: ");
	   shares = input.nextDouble();
	   System.out.print("Enter commission rate (as a percentage): ");
	   rate= input.nextDouble();      
	   
      // Compute the value of shars, commision and net proceeds
	   value = price * shares;
	   com = value * (rate/100);
	   net = value - com;
      
      // Display results
	  System.out.println(line);
	  System.out.println("Value of share: $" + value);
	  System.out.println("Commission: $" + com);
	  System.out.println("Net proceeds: $" + net);
	  System.out.println(stars);
   }
}