
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A5q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the user to give a word
        System.out.println("Please enter a word to translate. (type END to quit)");

        //collect word
        String word = input.nextLine();

        //determine word length
        int length = word.length();
        
        //check individual characters
        for (int i = 0; i < length + 1; i++) {
            //quit command
            if (word.equals("END")) {
                System.out.println("Goodbye.");
                break;
            }
            //find vowels
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y' && i > 0) {
                
                //find letters before vowel
                String beginning = word.substring(0, i);
                //find letters after vowel
                String ending = word.substring(i);
                //if word starts with a vowel
                if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
                    word = ending + beginning + "hee";
                } else {
                    //if word does not start with vowel
                    word = ending + beginning + "ee";
                }
                //print the translated word
                String translatedWord = word.replaceFirst("" + word.charAt(0), "i");
                System.out.println("This word in Mattenenglisch is " + translatedWord);
                break;

            }
        }
    }
}
