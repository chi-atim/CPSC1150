/*
**Program Name: SentenceMenu
**Author: Chiemi Mita
**Class Section: CPSC1150-004
**Instructor: Hengameh Hamavand
**Date: October 14th, 2018
*/

import java.util.Scanner;
public class SentenceMenu
{
   public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		String sent;
		System.out.println("Please enter a sentence: "); // Read the user input sentence 
		sent = input.nextLine();
		sent = sent.trim(); //Trim the blanks
		int action;
		do
		{
			Scanner menu = new Scanner (System.in);
			System.out.println("\nPlease enter: "
			+ "\n1. To display the number of words in the sentence."
			+ "\n2. To display the number of vowel characters in the sentence." 
			+ "\n3. To display the word with the most number of characters."
			+ "\n4. To display the word with the most vowels."
			+ "\n5. To enter a new statement."
			+ "\n6. To terminate the program.\n");
			action = menu.nextInt();
			switch (action)
			{
				case 1:		wordCounter(sent); //Call the wordCounter method
								break;
				case 2:		vowelCounter(sent); //Call the vowelCounter method
								break;
				case 3:		longestWord(sent); //Call the longestWord method
								break;
				case 4:		mostVowel(sent); //Call the mostVowel method
								break;
				case 5:		sent = newStatement(sent); //Call the newStatement method
								break;
				case 6:		System.out.println("Program terminates.");// Terminates the program
								break;
				default:	System.out.println("Error: invalid status"); // Error msg for invalid inputs
			}
		}while (action != 6);
	}

	public static void wordCounter (String str)  //Case 1: method
	{
		int count = 0;
		for(int i = 0; i < str.length(); i ++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
			{
				count++;
			}
		}
		count ++;
		System.out.println("\nThere are " + count + " words in " + "\"" + str + "\"");
    }

   public static void vowelCounter (String str) //Case 2: method
	{
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		String s = str.toLowerCase();
		for(int i = 0; i < s.length(); i ++)
		{
			switch(s.charAt(i))
			{
				case 'a' :	aCount++;
								break;
				case 'e' :	eCount++;
								break;
				case 'i' :	iCount++;
								break;
				case 'o' :	oCount++;
								break;
				case 'u' :	uCount++;
								break;
				default:	continue;
			}
		}
		System.out.println("\nThere are:\n\t" + aCount + " a's\n\t" + eCount + " e's\n\t" + iCount + " i's\n\t" + oCount + " o's\n\t" + uCount +" u's \n in \"" + str + "\"");
    }
   
	public static void longestWord (String str) //Case 3: method
	{
		int max = 0;
		String longest = "", word = "";
		for(int i = 0; i < str.length(); i ++)
		{
			char k = str.charAt(i);
			if (k != ' ')
			{
				word = word + k ; 
			}
			if (k == ' ' ||  i == str.length() - 1)
			{
				int n = word.length();
				if (n > max)
				{
					max = n;
					longest = word;
				}
				word = ""; // reset word
			}
		}
	  System.out.println("\nThe longest word is: " + longest);
    }

   public static void mostVowel (String str) //Case 4: method
	{
		String word = "", mostV = "";
		int max=0, count=0;
		for(int i = 0; i < str.length(); i ++)
		{
			char k = str.charAt(i);
			if (k != ' ')
			{
				word = word + k ;
				if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I' || k == 'O' || k == 'U')
				{
					count ++;
				}
			}
			if (k == ' ' && str.charAt(i+1) != ' ' || i == str.length() - 1)
			{
				if (count > max)
				{
					mostV = word;
					max = count;
				}
				word = ""; count = 0; // reset word and count
			}
		}
		System.out.println("\nThe word with the most vowels is: " + mostV);
	}
	
   public static String newStatement (String str) //Case 5: method
	{
		Scanner input = new Scanner (System.in);
		String newS;
		System.out.println("\nPlease enter a new statement: ");
		newS = input.nextLine();
		newS = newS.trim();
		return newS;
	}
}