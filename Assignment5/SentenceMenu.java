/*
**Program Name: SentenceMenu
**This program reads a sentence (one line of text) from the user, it then displays a menu for different tasks.
*/

import java.util.Scanner;

public class SentenceMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String sent;

		// Read the user input sentence
		System.out.println("Please enter a sentence: "); 
		sent = input.nextLine();
		sent = sent.trim(); //Trim the blanks
		int action;

		Scanner menu = new Scanner (System.in);

		do {
			//Scanner menu = new Scanner (System.in);
			System.out.println("\nPlease enter: "
			+ "\n1. To display the number of words in the sentence."
			+ "\n2. To display the number of vowel characters in the sentence." 
			+ "\n3. To display the word with the most number of characters."
			+ "\n4. To display the word with the most vowels."
			+ "\n5. To enter a new statement."
			+ "\n6. To terminate the program.\n");
			action = menu.nextInt();
			
			switch (action) {
				case 1:	
					wordCounter(sent);
					break;
				case 2:	
					vowelCounter(sent);
					break;
				case 3:	
					longestWord(sent);
					break;
				case 4:	
					mostVowel(sent);
					break;
				case 5:	
					sent = newStatement(sent);
					break;
				case 6:	
					System.out.println("Program terminates.");
					break;
				default:
					// Error msg for invalid inputs
					System.out.println("Error: invalid status");
			}
		} while (action != 6);
		input.close();
		menu.close();
		
	}

	//Case 1: wordCounter method
	public static void wordCounter (String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')) {
				count++;
			}
		}
		count ++;
		System.out.println("\nThere are " + count + " words in " + "\"" + str + "\"");
	}

	//Case 2: vowelCounter method
	public static void vowelCounter (String str) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		String s = str.toLowerCase();

		for(int i=0; i < s.length(); i++) {
			switch(s.charAt(i)) {
				case 'a':
					aCount++;
					break;
				case 'e':
					eCount++;
					break;
				case 'i':
					iCount++;
					break;
				case 'o':
					oCount++;
					break;
				case 'u':
					uCount++;
					break;
				default:
					continue;
			}
		}
		System.out.println("\nThere are:\n\t" + aCount + " a's\n\t" + eCount + " e's\n\t" + iCount + " i's\n\t" + oCount + " o's\n\t" + uCount +" u's \n in \"" + str + "\"");
	}
   
	// Case 3: longestWord method
	public static void longestWord (String str) {
		int max = 0;
		String longest = "", word = "";
		
		for(int i=0; i<str.length(); i++) {
			char k = str.charAt(i);
			if (k != ' ') {
				word = word + k ; 
			}
			if (k == ' ' ||  i == str.length() - 1) {
				int n = word.length();
				if (n > max) {
					max = n;
					longest = word;
				}
				word = ""; // reset word
			}
		}
		System.out.println("\nThe longest word is: " + longest);
	}

	//Case 4: method
	public static void mostVowel (String str) {
		String word = "", mostV = "";
		int max=0, count=0;
		
		for(int i=0; i<str.length(); i++) {
			char k = str.charAt(i);
			if (k != ' ') {
				word = word + k ;
				if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I' || k == 'O' || k == 'U') {
					count ++;
				}
			}
			if (k == ' ' && str.charAt(i+1) != ' ' || i == str.length() - 1) {
				if (count > max) {
					mostV = word;
					max = count;
				}
				word = ""; count = 0; // reset word and count
			}
		}
		System.out.println("\nThe word with the most vowels is: " + mostV);
	}

	//Case 5: method
	public static String newStatement (String str) {
		Scanner input = new Scanner (System.in);
		String newS;
		System.out.println("\nPlease enter a new statement: ");
		newS = input.nextLine();
		newS = newS.trim();
		return newS;
	}
}
