/*
**Program Name: Pyramid
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor: Hengameh Hamavand
**Date: September 30th, 2018
*/

import java.util.Scanner;
public class Pyramid
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in); // Create a Scanner
		int num, row, col, space; //All to be integer numbers
		
		// Prompt the user to enter a number
		System.out.print("Please enter a number from 1 - 9: "); 
		num = input.nextInt();
		
		if (num < 1 || num > 9)
		{
			System.out.println("The number must be 1 - 9"); //Display an error message
		}
		else
		{
			for (row = 1; row <= num; row ++ )
			{
				for (space = num - row; space >= 1; space --)
				{
					System.out.print("  "); //Display spaces
				}
				for (col = 1; col < row; col ++)
				{
					System.out.print(row-col+1); //Display the left side of the pyramid
				}
				for (col = 1; col <= row; col ++)
				{
					System.out.print(col); //Display the right side of the pyramid
				}
				System.out.println("");
			}
		}
	}
}

			
				
