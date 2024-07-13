import java.util.Scanner;
import java.lang.*;

public class countLetters{

public static void main(String[ ] args){

int[ ] counts = new int[26];

Scanner scan = new Scanner(System.in);

//get word from user

System.out.print("Enter a single word (letters only, please): ");

String word = scan.nextLine( );

//convert to all upper case

word = word.toUpperCase( );

//count frequency of each letter in string


try {
    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);  // Accessing each character
        if (!Character.isLetter(c)) {
            // Check if character is not a letter
            throw new ArrayIndexOutOfBoundsException("Non-letter character found: " + c);
        }else{
            counts[word.charAt(i)-'A']++;
        }
    }
} catch (ArrayIndexOutOfBoundsException e) {
    // Catching ArrayIndexOutOfBoundsException thrown for non-letter characters
    System.out.println("Exception occurred: " + e.getMessage());
}



//print frequencies

System.out.println( );

for (int i=0; i < counts.length; i++)

if (counts [i] != 0)

System.out.println((char)(i +'A') + ": " + counts[i]);

}

}