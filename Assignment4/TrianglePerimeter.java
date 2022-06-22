/*
**Program Name: Triangle Perimeter
**This program calculates the perimeter of a Triangle.
*/

import java.util.Scanner;
public class TrianglePerimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int x1, y1, x2, y2, x3, y3, l1, l2, l3;
		double result;
		String answer = "";
		System.out.println("This program calculates the perimeter of a Triangle.");
	
		do {
			// Prompt the user to enter inputs
			System.out.print("\nPlease enter the x-coordinate of point1: ");
			x1 = input.nextInt();
			System.out.print("Please enter the y-coordinate of point1: ");
			y1 = input.nextInt();
			System.out.print("Please enter the x-coordinate of point2: ");
			x2 = input.nextInt();
			System.out.print("Please enter the y-coordinate of point2: ");
			y2 = input.nextInt();
			System.out.print("Please enter the x-coordinate of point3: ");
			x3 = input.nextInt();
			System.out.print("Please enter the y-coordinate of point3: ");
			y3 = input.nextInt();
			
			// Invoke verify_input methods
			boolean verify_input1 = verify_input1(x1, y1, x2, y2, x3, y3); 
			boolean verify_input2 = verify_input2(x1, y1, x2, y2, x3, y3);

			if (verify_input1 && verify_input2) {
				//Compute the perimeter.
				l1 = (int)Math.pow(x1-x2, 2) + (int)Math.pow(y1-y2, 2);
				l2 = (int)Math.pow(x1-x3, 2) + (int)Math.pow(y1-y3, 2);
				l3 = (int)Math.pow(x2-x3, 2) + (int)Math.pow(y2-y3, 2);
				result = Math.sqrt (l1) + Math.sqrt (l2) + Math.sqrt (l3);
				//Display the result
				System.out.println("\nThe perimeter of a Triangle with point 1 (" + x1 + ", " + y1 + "), point 2 (" + x2 +", " + y2 + ") and point3 (" + x3 + ", " + y3 + ") is " + result + "\n");
				System.out.print("Would you like to repeat the program?(yes/no): ");
				answer = input.next();
			}
			else if (verify_input1 == false || verify_input2) {
				System.out.println("\nError: The three points must make a triangle.");
			}		
			else { 
				System.out.println("\nError: The points must be in the 40 X 40 grid.");
			}

		} while (answer.equalsIgnoreCase("yes"));
		
		System.out.println("\nEnd of the program.");
		input.close();
	}
	//Method1
	public static boolean verify_input1 (int x1, int y1, int x2, int y2, int x3, int y3) {
		//The three points make a traiangle not a line.
		int j = (y3 - y2) * x1 + (x2 - x3) * y1 + (x3 * y2 - x2 * y3);
		if ( j != 0) {
			return true;
		}
		return false;
	}
	//Method2
	public static boolean verify_input2 (int x1, int y1, int x2, int y2, int x3, int y3) {
		//The points should be on the 40 x 40 grid.
		if ((0 < x1) && (x1 < 41) && (0 < x2) && (x2 < 41) &&
			(0 < x3) && (x3 < 41) && (0 < y1) && (y1 < 41) && 
			(0 < y2) && (y2 < 41) && (0 < y3) && (y3 < 41)) {
			return true;
		}
		return false;
	}
}
