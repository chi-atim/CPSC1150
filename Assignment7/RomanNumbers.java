/*
**Program Name: RomanNumbers
**This program converts a positive integer into Roman Number System.
*/

import java.util.Scanner;

public class RomanNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Read the user input
		System.out.print("Please enter a number between 1 and 3999: ");
		int num = input.nextInt();

		if (num < 1 || num > 3999)
			System.out.println("Error: A number must be between 1 and 3999."); // Display an error msg
		else
			toRoman (num);
	}

	// A method to change the input number to Romn number system
	public static void toRoman (int num) {
		// 1000 - 3000
		String[] thous = {"", "M", "MM", "MMM"};
		
		// 100 - 900
		String[] huns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		// 10 - 90
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		// 1 - 9
		String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		//Convert each digit separately to Roman and Display
		System.out.println(thous[num/1000] + huns[(num/100)%10] + tens[(num/10)%10] + ones[num%10]);
	}
}

