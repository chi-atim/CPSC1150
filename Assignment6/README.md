### Assignment #6

Goals:  
This lab gives students more experience in   
•	Top-down design.  
•	Procedural abstraction using methods.  
  
  
  
Background Information:  
A year with 366 days is called a leap year.  A year is a leap year if it is divisible by 4 (For example, 1996), except that it is not a leap year if it is divisible by 100 (For example, 1900); however, it is a leap year if it is divisible by 400 (for example, 2000); and there were no leap years before the introduction of the Gregorian Calendar on October 15, 1582.

Requirement:  
Design an algorithm, and then write the java program to ask the user to enter a year greater than 1582.  
Your program then displays the following:  
•	If the year is a leap year or not.  
•	If the given year is a leap year, your program should then display  
    1.	which day of the week was Feb 29th, and  
    2.	the next leap year where Feb. 29th happens on the same week day.  

The following is a screen sample of the program:

      Please enter a year greater than 1582: 2013
        Year 2013 is not a leap year.

      Do you want to repeat the program: yes

      Please enter a year greater than 1582: 2000

        Year 2000 is a leap year
        Feb 29, 2000 is on Tuesday
        The next leap year where Feb 29 is on Tuesday is year 2028

      Do you want to repeat the program: no

      Program terminates


NOTE:  
Use Zeller’s Algorithm to compute a single digit, 0 to 6, for Sunday through Saturday.  
For example, 22/10/1999 has occurred on Friday so the zellers(1999, 10, 22) returns 5 representing Friday.  
  
 

Key points:  
•	Presentation/Style: Organization, readability, descriptive identifier, indentation, bracket placement.   
•	Correctness: Program works without bugs. Appropriate use of methods.  
•	Documentation: External (pseudo code for the main method only) and Internal.


