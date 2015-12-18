/**
 * Created by Conal on 18/12/2015.
 */
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        // Read user input as a String
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        // Reverse the String and check if it's equal to the input
        String reverseWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reverseWord)) {
            System.out.println("The word is a palindrome!");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}
