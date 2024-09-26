import java.util.Scanner;

public class MadLib {
    public static void main(String[] args)
    {
       String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
    //    madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
    //    madlib = ".......";
       Scanner scanner = new Scanner(System.in);

       int openingBracketIndex = madlib.indexOf("<");
       int closingBracketIndex = madlib.indexOf(">");

       String madlibFirstWord = madlib.substring(openingBracketIndex +1, closingBracketIndex);
       System.out.println("Enter a " + madlibFirstWord);

       String userInput = scanner.nextLine();





       



    }


}