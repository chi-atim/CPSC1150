/*
**Program Name: LeapYear
**This program asks the user to enter a year, it then checks whether it is a leap year or not.
**If it is a leap year, it then displays informations.
*/

import java.util.Scanner;
public class LeapYear {
	public static void main (String[] args) {
		Scanner input1 = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		String repeat = "";

		do {
			System.out.print("\nPlease enter a year greater than 1582: "); // Read the user input
			int year = input1.nextInt();

			if (year <= 1582) {
				System.out.println("Error: A year must be greater than 1582."); // Error msg
			}
			else {
				if (isLeapYear(year)) {
					int newYear = year + 4;
					int z1 = zellers(year);
					int z2 = zellers(newYear);
					
					while (z1 != z2) {
						newYear = newYear + 4;
						z2 = zellers(newYear);
					}
					
					System.out.println("\nYear " + year + " is a leap year. " 
					+ "\nFeb 29, " + year + " is on " + dayOfWeek(z1)
					+ "\nThe next leap year where Feb 29 is on " + dayOfWeek(z1) + " is year " + newYear);
				}
				else {
					System.out.print("Year " + year + " is not a leap year.\n");
				}
			}
			
			System.out.print("\nDo you want to repeat the program: ");
			repeat = input2.next();
			
		} while (repeat.equalsIgnoreCase("yes"));

		System.out.println("\nProgram terminates.");
	}

	public static boolean isLeapYear (int year) {
		if (year % 4 == 0 && year % 100 > 0 || year % 400 ==0)
			return true;
		return false;
	}

	public static int zellers (int year) {
		int DayNumber, StartMonth = 0, StartYear = 0, LeapFactor;
		int month, day;
		month = 2; // February
		day = 29; // 29th of February
		
		if (month < 3) {
			StartMonth = 0;
			StartYear = year - 1;
		}
		LeapFactor = (StartYear/4) - (StartYear/100) + (StartYear/400);
		return DayNumber = ((365 * year + 31 * (month - 1) + day + LeapFactor - StartMonth)-1) % 7;
	}

	public static String dayOfWeek (int z) {
		switch(z) {
			case 0: return "Sunday";
			case 1: return "Monday";
			case 2: return "Tuesday";
			case 3: return "Wednesday";
			case 4: return "Thursday";
			case 5: return "Friday";
			case 6: return "Saturday";
		}
		return "Error";
	}
}
	
	
	
