/*
**Program StudentRecordsMenu
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor: Hengameh Hamavand
**Date: November 11th, 2018
*/

import java.io.*;
import java.util.*;
public class StudentRecordsMenu
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner (System.in);
      String classFile = "classList.txt";

      int action;
		do
		{
			System.out.println("\nPlease enter: "
			+ "\n1. To display a specific student’s record."
			+ "\n2. To calculate the final exam average." 
			+ "\n3. To find a student with the highest score on the final exam."
			+ "\n4. To copy the students’ record to another file."
			+ "\n5. To terminate the program.\n");
			action = input.nextInt();
			switch (action)
			{
				case 1:		studentsRecord(classFile); //Call the studentsRecord method
								break;
				case 2:		finalAverage(classFile); //Call the finalAverage method
								break;
				case 3:		highestScore(classFile); //Call the highestScore method
								break;
				case 4:		copyFile(classFile); //Call the copyFile method
								break;
				case 5:		System.out.println("Program terminates.");// Terminates the program
								break;
				default:    System.out.println("Error: invalid status"); // Error msg for invalid inputs
			}
		}while (action != 5);
	}
	
	public static void studentsRecord (String inFileName) throws IOException// Method 1
   {
	   Scanner input = new Scanner (System.in);
	   int count1=0, count2=0;
	   String line, name, studentsName, id, score;
	   System.out.print("Please enter the student's name: ");
	   studentsName = input.nextLine();
	   Scanner inFile = new Scanner (new File (inFileName));
	   
	   while(inFile.hasNextLine())
		{
			line = inFile.nextLine();
			if (!line.equals("")) // Skip the empty line
			{
				count1++; // count each lines
				name = line.substring(line.indexOf(':')+1, line.lastIndexOf(':'));
				if(name.equalsIgnoreCase(studentsName))
				{
					id = line.substring(0, 8);
					score = line.substring(line.lastIndexOf(':')+1);
					System.out.println("\nName: " + name + "\nID: " + id + "\nFinal : " + score);
				}
				else
				{
					count2++; // count "not a match" lines
				}
			}
		}
		if (count1 == count2)
		{
			System.out.println("\nNo Match.");
		}
		inFile.close();
	}
   
   public static void finalAverage (String inFileName) throws IOException // Method 2
   {
	   String line, scoreStr;
	   int score, count=0;
	   double sum=0;
	   Scanner input = new Scanner (System.in);
	   Scanner inFile = new Scanner (new File(inFileName));
	   
	   while(inFile.hasNextLine())
		{
			line = inFile.nextLine();
			if (!line.equals("") && !line.equals("ID:Name:Final")) // Skip the first two lines
			{
				count++; // count each lines
				scoreStr = line.substring(line.lastIndexOf(":")+1);
				score = Integer.parseInt(scoreStr); //Convert string to integer
				sum += score;
			}
		}
		System.out.println("The final exam average is: " + sum/count);
		
		inFile.close();
	}
   
   public static void highestScore (String inFileName) throws IOException// Method 3
   {
	   String line, name, id, scoreStr;
	   String highest="";
	   int score, highestScore=0;
	   Scanner input = new Scanner (System.in);
	   Scanner inFile = new Scanner (new File(inFileName));
	   
	   while(inFile.hasNextLine())
		{
			line = inFile.nextLine();
			if (!line.equals("") && !line.equals("ID:Name:Final")) // Skip the first two lines
			{
				scoreStr = line.substring(line.lastIndexOf(":")+1);
				score = Integer.parseInt(scoreStr); //Convert string to integer
				if(score > highestScore)
				{
					highestScore=score;
					highest = line;
				}
			}
		}
		id = highest.substring(0, 8);
		name = highest.substring(highest.indexOf(':')+1, highest.lastIndexOf(':'));
		System.out.println("The student with highest score to the final exam: \nName: " + name + "\nID: " + id + "\nFinal exam score: " + highestScore);
		
		inFile.close();
	}
   
   public static void copyFile (String inFileName) throws IOException// Method 4
   {
	   String outFileName, line;
	   Scanner input = new Scanner (System.in);
	   Scanner inFile = new Scanner (new File(inFileName));
	   System.out.println("Please enter the file name: "); // Ask user for the output file name
	   outFileName = input.nextLine();
	   PrintWriter outFile = new PrintWriter(new File(outFileName));
	   while(inFile.hasNextLine())
		{
			line = inFile.nextLine(); //Read each line from input text file
			outFile.println(line); //Print each line on output text file
		}
		inFile.close();
		outFile.close();
   }
}