/**
**Program Name: WindChill
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor : Hengameh Hamavand
**Date: September 22th, 2018
*/

import java.util.Scanner; // Import java.util package

public class WindChill
{
	/**This program will calculate the wind-chill index .
	*/	
	public static void main(String[] args)
   {
		//Declare strings
	   String stars = "******************************************";
	   String line = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
	   
		// Scanner object
		Scanner input = new Scanner(System.in); 
		
		int temp, wspeed;
		double wchill;

		// Display introduction
		System.out.println(stars);
		System.out.println("This program calculates the wind-chill index.");
	    System.out.println(line);
		// Prompt the user to enter a temperature
		System.out.println("Enter the temperature in Celsius: "); 
		temp = input.nextInt();
	   
		if ((temp < -50) || (temp > 5))
		{
			System.out.println(line);
			System.out.println("The temperature must be between -50ºC and 5ºC."); //Display an error message
			System.out.println(stars);
		}
		else
		{
			// Prompt the user to enter a wind speed
			System.out.print("Enter the wind speed kilometers per hour: ");
			wspeed  = input.nextInt();
			
			if ((wspeed < 0) || (wspeed > 100))
			{
				System.out.println(line);
				System.out.println("The wind speed must be between 0 and 100 km/h."); //Display an error message
				System.out.println(stars);
			}
			else
			{
			// Compute the wind-chill
			wchill = 13.112 + 0.6215 * temp - 11.37 * Math.pow(wspeed, 0.16) + 0.3961 * temp * Math.pow(wspeed, 0.16);
			//Display the result
	  		System.out.println(line);
			System.out.println("The wind chill index is " + (int)wchill);
			System.out.println(stars);
			}
		}
	}
}