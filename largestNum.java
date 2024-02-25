// import java.util.*;
import java.lang.Integer;

public class largestNum {

    public static int largest(int number[]) {
        int larg = Integer.MIN_VALUE; // Initialize to negative infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > larg) {
                larg = number[i]; // Update largest value if the current element is greater
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is : "+ smallest);
        return larg; // Return the largest value found in the array
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 5, 7, 1, 56, 20 };
        System.out.println("Largest value is: " + largest(number)); // Print the result of the largest method
    }
}
