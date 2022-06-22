/*
**Program Name: RomanNumbers
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor: Hengameh Hamavand
**Date: October 28th, 2018
*/

import java.util.Scanner;
public class RomanNumbers
{
   public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a number between 1 and 3999: "); // Read the user input
		int num = input.nextInt();
		
        if (num < 1 || num > 3999)
			System.out.println("Error: A number must be between 1 and 3999."); // Display an error msg
        else
			toRoman (num);
	}
	 
	public static void toRoman (int num)
	{
		String[] thous = {"", "M", "MM", "MMM"}; // 1000 - 3000
		String[] huns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; // 100 - 900
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; // 10 - 90
		String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; // 1 - 9
		
		System.out.println(thous[num/1000] + huns[(num/100)%10] + tens[(num/10)%10] + ones[num%10]); //Convert each digit separately to Roman and Display
	}
}