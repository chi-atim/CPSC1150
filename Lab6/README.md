### Lab 6

Design and implement a java program which asks the user to enter a year greater than 1582. Your program then displays which day of the week is the first day of January of that year.

The following is a screen sample of the program:

          Please enter a year greater than 1582:
          2017

          The first day of January 2017 is on Sunday



Use the Zeller’s Congruence, to compute a single digit, 0 to 6, for Sunday through Saturday.  
For example, 22/10/1999 has occurred on Friday so the zellers(1999, 10, 22) returns 5 representing Friday.


          Zeller’s Algorithm

          Define Terms
		0.1 Given the YEAR, MONTH and DAY, representing a date.
		0.2 Let DayNumber be the an integer number representing the day of the week( 0 represents Sunday, 6 represents Saturday) 
		0.3 Let StartMonth, StartYear, and LeapFactor be three integer variables used in the calculation
        
	
          Start
          1.  IF MONTH < 3  
		1.1 StartMonth = 0
		1.2 StartYear   = YEAR – 1 
  	  		    
              OTHERWISE
		1.3	StartMonth = INT (0.4 * MONTH + 2.3)
		1.4 StartYear   = YEAR

          2. LeapFactor = (StartYear / 4) – (StartYear / 100) + (StartYear / 400)

          3. RETURN  DayNumber = ((365 * YEAR  + 31 * (MONTH  – 1) + DAY +  LeapFactor – StartMonth) – 1) MOD 7 

 

Day == 1, month == 1, year == userInput  
  
  
2 methods  
-zellers  
-dayOfWeek
