/*
**Program Name: Pyramid
**This program prompts the user to enter an integer from 1 to 9 and display a pyramid.
*/

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); // Create a Scanner
		int num, row, col, space; //All to be integer numbers

		// Prompt the user to enter a number
		System.out.print("Please enter a number from 1 - 9: "); 
		
		// CHeck if input is an integer
        if(input.hasNextInt()){
			num = input.nextInt();
            
			if (num<1 || num>9) {
				//Display an error message
				System.out.println("The number must be 1 - 9");
			}
			else {
				for (row = 1; row <= num; row ++ ) {
					for (space=num-row ; space>=1; space--) {
						System.out.print(" "); //Display spaces
					}
					for (col = 1; col < row; col ++) {
						System.out.print(row-col+1); //Display the left side of the pyramid
					}
					for (col=1; col<=row; col++) {
						System.out.print(col); //Display the right side of the pyramid
					}
					System.out.println();
				}
			}
        }
        else{
			//Display an error message for non-integer
            System.out.println("Input is not an integer");
        }
		input.close();
	}
}

			
				
