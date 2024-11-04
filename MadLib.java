import java.util.Scanner;

public class MadLib {
   public static void main(String[] args) {
      // String madlib = "I went to the animal <noun>, the <plural noun> and the
      // <number> beasts were there.";
      // String madlib = "Once upon a time in a <adjective> land, a <noun> <adverb>
      // grew.";
      String madlib = "The <adjective> comet flashed <adverb> across the <noun>";
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
      firstPart = madlib.substring(0, openingBracketIndex2);
      secondPart = madlib.substring(closingBracketIndex2 + 1);
      madlib = firstPart + userInput2 + secondPart;

      // Find where the third unknown is
      int openingBracketIndex3 = madlib.indexOf("<");
      int closingBracketIndex3 = madlib.indexOf(">");
      String madlibThirdWord = madlib.substring(openingBracketIndex3 + 1, closingBracketIndex3);
      // Prompt reader to put in third word
      System.out.println("Enter a " + madlibThirdWord + ": ");
      String userInput3 = scanner.nextLine();
      // Put that word back into the madlib
      firstPart = madlib.substring(0, openingBracketIndex3);
      secondPart = madlib.substring(closingBracketIndex3 + 1);
      madlib = firstPart + userInput3 + secondPart;

      System.out.println(madlib);

   }

}