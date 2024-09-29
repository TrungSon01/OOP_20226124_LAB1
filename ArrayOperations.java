import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter array elements or use constant
        System.out.print("Do you want to enter the array manually? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int[] numbers;
        
        if (choice.equals("yes")) {
            // User input
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            numbers = new int[n];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
        } else {
            // Using a constant array
            numbers = new int[]{5, 8, 1, 12, 7, 3, 10};
            System.out.println("Using a constant array: " + Arrays.toString(numbers));
        }
        
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Calculating sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        
        // Display results
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);

        scanner.close();
    }
}
