/*
    Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text
is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced 
with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the
number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading
zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be
replaced by the abbreviation and the words that are not too long should not undergo any changes.
 */
import java.util.Scanner;
   
public class WayTooLongWords {
    
    public static void main(String [] args)
    { 
        Scanner input = new Scanner(System.in);
        
        int count = input.nextInt();

        while (count>0) {
            
            /* For the person who is executing the program to determine the input. 
            In this case, the input is a word, so we use "String". */
            String word = input.next();
            
            /* char = "character"; We use "charAt(0)" to refere to the first character of the string (the one at the position 0),
            the same thing applies to the last character.
            
            * The length of the word is a number, so we define it as an integer, in this case I called it "b". I subtract 2 
            from the integer b because I am excluding the first and last characters of the input word.*/
                
            char firstChar = word.charAt(0);
            int b = word.length() - 2;
            char lastChar = word.charAt(word.length() - 1);
            
            if (word.length() > 10) {
                System.out.println(firstChar + "" + b + "" + lastChar);
            }
                
            else {
                System.out.println(word);
            }

            count--;

        }
   
    }
}
