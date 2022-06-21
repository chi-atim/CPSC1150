import java.util.Scanner;

public class WordCounter{
   public static void main(String[] args)	{
      Scanner input = new Scanner (System.in);
      String sent;

      System.out.print("Please enter a sentence: ");
      sent = input.nextLine();
      sent = sent.trim();
      int words = sentCounter(sent);

      System.out.print("There are " + words + " words in\n" + "\"" + sent + "\"");
      
      input.close();
   }

   public static int sentCounter (String str) {
      int count = 0;

      for(int i = 0; i < str.length(); i ++) {
         if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')) {
            count++;
         }
      }
      return count + 1;
   }
}
