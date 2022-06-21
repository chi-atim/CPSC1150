import java.util.Scanner;
public class Zellers
{
   public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
      System.out.println("Please enter a year greater than 1582: ");
      int year = input.nextInt();
		
      int z = zellers(year);
      System.out.println("The first day of January " + year + " is on " + dayOfWeek(z));

      input.close();
   }
	
	public static int zellers (int year) {
		int StartMonth = 0, StartYear = 0, LeapFactor;
		int month, day;
      month = 1; // January
      day = 1; // 1st of January
      
		if (month < 3)	{
			StartMonth = 0;
			StartYear = year - 1;
		}
		LeapFactor = (StartYear/4) - (StartYear/100) + (StartYear/400);
		return ((365 * year + 31 * (month - 1) + day + LeapFactor - StartMonth)-1) % 7;
   }
   
   public static String dayOfWeek (int z)	{
      switch(z) {
         case 0: return "Sunday";
         case 1: return "Monday";
         case 2: return "Tuesday";
         case 3: return "Wednesday";
         case 4: return "Thursday";
         case 5: return "Friday";
         case 6: return "Saturday";
      }
      return "Error";
   }
}