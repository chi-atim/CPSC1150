import java.util.Scanner;
public class Addition40digits
{
   public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		String num1, num2;
		System.out.print("Number1: ");
		num1 = input.nextLine();
		System.out.print("Number2: ");
		num2 = input.nextLine();
		
		int list1 [] = new int[num1.length()];
		int list2 [] = new int[num2.length()];
		
		if (isValid(num1) && isValid(num2))
		{
			for (int i=0; i<list1.length; i++) //convert list1 char to int
			{
				list1[i] = num1.charAt(i)-'0';
			}
			for (int j=0; j<list2.length; j++)//convert list2 char to int
			{
				list2[j] = num2.charAt(j)-'0';
			}
			display(list1, list2, sum(list1, list2));
		}
  }

	public static boolean isValid (String str) //A method to verify user input
	{
		int good=0;
		if (str.length() <= 40)
		{
			for (int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)>='0' && str.charAt(i)<='9')
				{
					good ++;
				}
			}
			if (good == str.length())
			{
				return true;
			}
			System.out.println("Error: Expecting all digit characters.");
			return false;
		}
		System.out.println("Error: Expecting up to 40 digit number.");
		return false;
   }
   
   public static int[] sum (int[] list1, int[] list2)//A method to sum 2 numbers
	{
		int len, i=list1.length-1, j=list2.length-1;
		
		if (list1.length>list2.length)
			len=list1.length+1;
		else
			len=list2.length+1;
		int[] result = new int [len]; // Create result int array

		for (int k=result.length-1;  k>= 0; k--)
		{
			if(i>=0)
			{
				result[k]+=list1[i];
				i--;
			}
			if(j>=0)
			{
				result[k]+=list2[j];
				j--;
			}
			if(result[k]>=10)
			{
				result[k]=result[k]%10;
				result[k-1]++;
			}
		}
		return result;
   }
   
   public static void display (int[] list1, int[] list2, int result[]) //A method to display the output
	{
		int gap1 = result.length - list1.length;
		int gap2 = result.length - list2.length;
		int i, j, k, x;
		System.out.println();
		for (i=0; i<result.length; i++)//Display the Number1
		{
			if (i <gap1)
			{
				System.out.print("  ");
			}
			else
			{
				if (i%3==result.length%3 && i>gap1)
				{
					System.out.print(",");
				}
				System.out.print(list1[i-gap1]);
			}
		}
		System.out.print("  +");
		System.out.println();
		
		for (j=0; j<result.length; j++)//Display the Number2
		{
			if (j <gap2)
			{
				System.out.print("  ");
			}
			else
			{
				if (j%3==result.length%3 && j>gap2)
				{
					System.out.print(",");
				}
				System.out.print(list2[j-gap2]);
			}
		}
		System.out.println();
		
		for (k=0; k<result.length; k++)
		{
			System.out.print("--");
		}
		System.out.println();
		
		for (x=0; x<result.length; x++)//Display the result
		{
			if(x==0&&result[x]==0)
			{
				System.out.print(" "+result[x+1]);
				x++;
				continue;
			}
			if (x%3==result.length%3 && x>0)// Add comma to the result
			{
				System.out.print(",");
			}
			System.out.print(result[x]);
		}
		System.out.println();
   }
}