/*
**Program StudentRecordsMenu
**This program displays information about the specified student form external file.
*/

import java.io.*;
import java.util.*;

public class StudentRecordsMenu {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner (System.in);
		String classFile = "Assignment8/classList.txt";

		int action;
		do {
			System.out.println("\nPlease enter: "
			+ "\n1. To display a specific student's record."
			+ "\n2. To calculate the final exam average." 
			+ "\n3. To find a student with the highest score on the final exam."
			+ "\n4. To copy the students' record to another file."
			+ "\n5. To terminate the program.\n");
			action = input.nextInt();
			switch (action) {
				case 1:	
					studentsRecord(classFile);
					break;
				case 2:	
					finalAverage(classFile);
					break;
				case 3:	
					highestScore(classFile);
					break;
				case 4:	
					copyFile(classFile);
					break;
				case 5:	
					System.out.println("Program terminates.");
					break;
				default:
					// Error msg for invalid inputs
					System.out.println("Error: invalid status");
			}
		} while (action != 5);
		input.close();
	}

	// Case1: studentsRecord method 
	public static void studentsRecord (String inFileName) throws IOException {
		Scanner input = new Scanner (System.in);
		int count1=0, count2=0;
		String line, name, studentsName, id, score;
		
		System.out.print("Please enter the student's name: ");
		studentsName = input.nextLine();
		Scanner inFile = new Scanner (new File (inFileName));

		while(inFile.hasNextLine()) {
			line = inFile.nextLine();
			
			// Skip the empty line
			if (!line.equals("")) {				
				//count each lines
				count1++;
				name = line.substring(line.indexOf(':')+1, line.lastIndexOf(':'));
				
				if(name.equalsIgnoreCase(studentsName)) {
					id = line.substring(0, 8);
					score = line.substring(line.lastIndexOf(':')+1);
					System.out.println("\tName: " + name);
					System.out.println("\tID: " + id);
					System.out.println("\tFinal: " + score);
					
				}
				else {
					count2++; // count "not a match" lines
				}
			}
		}
		if (count1 == count2) {
			System.out.println("\n\tNo Match.");
		}
		inFile.close();
	}

	// Case2: finalAverage method
	public static void finalAverage (String inFileName) throws IOException {
		String line, scoreStr;
		int score, count=0;
		double sum=0;
		Scanner input = new Scanner (System.in);
		Scanner inFile = new Scanner (new File(inFileName));

		while(inFile.hasNextLine()) {
			line = inFile.nextLine();
			
			// Skip the first two lines
			if (!line.equals("") && !line.equals("ID:Name:Final")) {
				count++;
				scoreStr = line.substring(line.lastIndexOf(":")+1);
				
				//Convert string to integer
				score = Integer.parseInt(scoreStr);
				sum += score;
			}
		}
		System.out.println("The final exam average is: " + sum/count);
		inFile.close();
	}
	
	// Case3: highestScore method
	public static void highestScore (String inFileName) throws IOException {
		String line, name, id, scoreStr;
		String highest="";
		int score, highestScore=0;
		Scanner input = new Scanner (System.in);
		Scanner inFile = new Scanner (new File(inFileName));

		while(inFile.hasNextLine()) {
			line = inFile.nextLine();
	
			// Skip the first two lines	
			if (!line.equals("") && !line.equals("ID:Name:Final")) {
				scoreStr = line.substring(line.lastIndexOf(":")+1);
				
				//Convert string to integer
				score = Integer.parseInt(scoreStr);
				if(score > highestScore) {
					highestScore=score;
					highest = line;
				}
			}
		}
		id = highest.substring(0, 8);
		name = highest.substring(highest.indexOf(':')+1, highest.lastIndexOf(':'));
		System.out.println("The student with highest score to the final exam:");
		System.out.println("\tName: " + name);
		System.out.println("\tID: " + id);
		System.out.println("\tFinal exam score: " + highestScore);
		System.out.println();
		

		inFile.close();
	}
   
	// Case4: copyFile method   
	public static void copyFile (String inFileName) throws IOException {
		String outFileName, line;
		Scanner input = new Scanner (System.in);
		Scanner inFile = new Scanner (new File(inFileName));
		
		// Ask user for the output file name
		System.out.println("Please enter the file name: ");
		outFileName = input.nextLine();
		PrintWriter outFile = new PrintWriter(new File(outFileName));

		while(inFile.hasNextLine()) {		
			//Read each line from input text file
			line = inFile.nextLine();
			//Print each line on output text file
			outFile.println(line);
		}

		inFile.close();
		outFile.close();
	}
}



