import java.io.*;
import java.util.*;

public class StudentsInfo{
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner (System.in);
		int count1=0, count2=0;
		String sc, name, studentsName;
		System.out.print("Please enter the student's name: ");
		studentsName = input.nextLine();
		Scanner inFile = new Scanner (new File ("classList.txt"));

		while(inFile.hasNextLine()) {
			count1 ++;
			sc = inFile.nextLine();
			name = sc.substring(sc.indexOf(':')+1, sc.lastIndexOf(':'));
			if(name.equalsIgnoreCase(studentsName)){
				printInfo(sc);
			}
			else{
				count2++;
			}
		}
		if (count1 == count2){
			System.out.println("No Match.");
		}
		input.close();
		inFile.close();
	}

	public static void printInfo (String line) {
		String idStr = line.substring(0, 8);
		int id = Integer.parseInt(idStr);
		String name = line.substring(line.indexOf(':')+1, line.lastIndexOf(':'));
		String scoreStr = line.substring(line.lastIndexOf(':')+1, line.lastIndexOf(':')+3);
		int score = Integer.parseInt(scoreStr);
		System.out.println("Name: " + name + "\nID: " + id + "\nFinal : " + score);
	}
}
