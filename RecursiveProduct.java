import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate the product of numbers in an array
    public static int productOfNumbers(int[] numbers, int index) {
        // Base case: if index is at the last element, return that element
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        // Recursive case: multiply the current number with the product of the remaining numbers
        return numbers[index] * productOfNumbers(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the product of the numbers using the recursive method
        int result = productOfNumbers(numbers, 0);

        // Output the result
        System.out.println("The product of the entered numbers is: " + result);
        
        scanner.close();
    }
}
