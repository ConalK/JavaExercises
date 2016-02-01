/**
 * Created by Conal on 19/12/2015.
 */
import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("elvis", "lives"));
    }
}
