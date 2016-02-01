/**
 * Created by Conal on 18/12/2015.
 */
public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            boolean isPrime = true;

            //check to see if the number is prime
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
