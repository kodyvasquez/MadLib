import java.util.Scanner;

public class MadLib {
   public static void main(String[] args) {
      String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
      // madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
      // madlib = ".......";
      Scanner scanner = new Scanner(System.in);

      // Find where the first unknown is
      int openingBracketIndex = madlib.indexOf("<");
      int closingBracketIndex = madlib.indexOf(">");
      String madlibFirstWord = madlib.substring(openingBracketIndex + 1, closingBracketIndex);
      // Prompt the reader to put in the first word
      System.out.println("Enter a " + madlibFirstWord + ": ");
      String userInput = scanner.nextLine();
      // Put that word back into the madlib
      String firstPart = madlib.substring(0, openingBracketIndex);
      String secondPart = madlib.substring(closingBracketIndex + 1);
      madlib = firstPart + userInput + secondPart;

      // Find where the second unknown is
      int openingBracketIndex2 = madlib.indexOf("<");
      int closingBracketIndex2 = madlib.indexOf(">");
      String madlibSecondWord = madlib.substring(openingBracketIndex2 + 1, closingBracketIndex2);
      // Prompt reader to put in second word
      System.out.println("Enter a " + madlibSecondWord + ": ");
      String userInput2 = scanner.nextLine();
      // Put that word back into the madlib
      firstPart = madlib.substring(0, openingBracketIndex);
      secondPart = madlib.substring(closingBracketIndex + 1);
      madlib = firstPart + userInput + secondPart;

      System.out.println(madlib);

   }

}