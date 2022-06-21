### Assignment #2
Goals:  
This assignment gives students more experience in:  
•	Problem Solving  
•	Writing Java programs  
•	Writing Algorithms, using pseudo code

Problem Description:  
How cold is it outside? The temperature alone is not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside.  
In 2001, the National Weather Service implemented the new wind-chill index to measure the coldness using temperature and wind speed.  
  
  
      The formula is given as follows:  
        Twc =  13.112 + 0.6215 Ta -11.37 V0.16 + 0.3965 Ta V0.16 
      Where 
      •	Ta  is the ambient air temperature in Celsius degree,
      •	V is the wind speed in kilometers per hour,
      •	Twc  is the wind-chill index.

      The formula can be used only for:
      •	wind speeds between 0 and 100 km/h, and
      •	temperatures between -50 and 5°C
      
Requirements:  
Write a program that prompts the user to enter a temperature and a wind speed, the program then displays the wind-chill index. Use Math.pow(a, b) to compute V0.16.  
Here is a sample program run:  
      This program calculates the wind-chill index.

      Enter the temperature in Celsius: 0 
      Enter the wind speed kilometers per hour: 20
      The wind chill index is -5

•	The program should display the wind chill index as an integer number.  
•	The programs should also display an appropriate error message and terminate if the user enters invalid input.  
For example:  
If the temperature entered is not between -50ºC and 5ºC.  
If the wind speed entered is not between 0 and 100 km/h.  
  
  

Key points:  
Presentation and Style: Readability, descriptive identifier,indentation, bracket placement 
Correctness: Program works without bugs
Error checking: Appropriate error message to the user when invalid data is entered.
Documentation: External and Internal.

