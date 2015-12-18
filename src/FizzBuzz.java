/**
 * Created by Conal on 18/12/2015.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        // For the numbers 1 to 100
        for (int i = 1; i <= 100; i++){
            // If the number is divisible by 3 and 5, print FizzBuzz
            if (i % (3*5) == 0) {
                System.out.println("FizzBuzz");
            }
            // If the number is divisible by 3, print Fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If the number is divisible by 5, print Buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
