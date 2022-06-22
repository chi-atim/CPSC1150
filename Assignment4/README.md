### Assignment #4

Goals: Use methods  
This lab gives students more experience in:  
•	Problem Solving  
•	Writing Java programs and methods  
•	Writing Algorithms, using Pseudocode  
  
  
Problem Description:  
In this assignment, you will perform calculations with triangles.  
A triangle is defined by the x- and y-coordinates of its three corner points.  
Your job is to compute the perimeter of a given triangle.  
  
  
The following is a sample program output:  

    This program calculates the perimeter of a Triangle.

    Please enter the x-coordinate of point1: 5
    Please enter the y-coordinate of point1: 5
    Please enter the x-coordinate of point2: 6
    Please enter the y-coordinate of point2: 7
    Please enter the x-coordinate of point3: 8
    Please enter the y-coordinate of point3: 5

    The perimeter of a Triangle with point1 (5, 5), point2 (6, 7) and point3 (8, 5) 
    is 8.064495

    Would you like to repeat the program? No

    End of the program. 

Notes:  
•	Appropriate error messages should be displayed in case of invalid inputs. This should be done by creating and calling a method called verify_input in your program.  
•	You may only accept positive integer numbers for the x- and y-coordinates of the three points.  
•	You may only accept the points located on the 40 X 40 grid.  
•	You may reject the input if the three points make a line and not a triangle.  
•	To calculate the square root of a number stored in variable “data”, use the Math.sqrt(data).  
•	You may use the Pythagoras’ theorem to calculate the length of the triangle sides.  
•	Your program should be repeated as long as the user wishes.  
•	Please use methods for this assignment.  

For example, create a method to verify the input and display appropriate error messages in the case of invalid input:  

    public static boolean verify_input (int point1_x, int point1_y, int point2_x, int point2_y, int point3_x, int point3_y) {  
      ....  
    }


Key points:  
•	Presentation/Style: Organization, readability, descriptive identifier, indentation, bracket placement.  
•	Correctness: Program (using methods) works without bugs.  
•	Error checking:  Appropriate error message to the user when invalid data is entered.  
•	Documentation: Internal.  


-	0 < x and y <= 40
-	perimeter length of 3 lines
-	calculate in main body
-	error messages in method 
-	a = b^2 + c ^2
-	length  = √ b^2 + a ^2
