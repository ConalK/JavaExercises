/**
 * Created by Conal on 22/12/2015.
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4};
        for (int numbers : myArray) {
            System.out.println(numbers);
        }
        reverse(myArray);
    }

    public static void reverse(int[] myArray) {
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
