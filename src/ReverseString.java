/**
 * Created by Conal on 16/12/2015.
 */
public class ReverseString {

    public static void main(String[] args) {

        String hi = "Hello";
        String reverse = new StringBuilder(hi).reverse().toString();
        System.out.println(reverse);
    }
}
