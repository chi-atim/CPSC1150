/**
**Program Name: WindChill
**This program will calculate the wind-chill index.
**Date: September 22th, 2018
*/

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args){

		// Scanner object
		Scanner input = new Scanner(System.in); 

		int temp, wspeed;
		double wchill;

		// Display introduction
		System.out.println("This program calculates the wind-chill index.\n");

		// Prompt the user to enter a temperature
		System.out.print("Enter the temperature in Celsius: "); 
		temp = input.nextInt();

		if ((temp < -50) || (temp > 5)) {
			System.out.println("The temperature must be between -50ºC and 5ºC."); //Display an error message
		}
		else {
			// Prompt the user to enter a wind speed
			System.out.print("Enter the wind speed kilometers per hour: ");
			wspeed  = input.nextInt();

			if ((wspeed < 0) || (wspeed > 100)) {
				System.out.println("The wind speed must be between 0 and 100 km/h."); //Display an error message
			}
			else {
				// Compute the wind-chill
				wchill = 13.112 + 0.6215 * temp - 11.37 * Math.pow(wspeed, 0.16) + 0.3961 * temp * Math.pow(wspeed, 0.16);
				//Display the result
				System.out.println("\nThe wind chill index is " + (int)wchill);
			}
		}
		input.close();
	}
}
