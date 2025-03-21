import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];  // Task 1: Declare an array of 100 integers
        Random rnd = new Random();  // Create a Random object

        // Task 2: Fill the array with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display the array values in a single line with " | " separator
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();  // Move to the next line after printing all values

        // Task 4 and Task 9: Calculate and display the average using the static method
        double average = getAverage(dataPoints);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Task 5: Prompt the user for an integer between 1 and 100
        Scanner in = new Scanner(System.in);
        int searchValue;
        do {
            System.out.print("Enter a value between 1 and 100 to search: ");
            searchValue = in.nextInt();
            if (searchValue < 1 || searchValue > 100) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
            }
        } while (searchValue < 1 || searchValue > 100);
        System.out.println("You entered: " + searchValue);

        // Task 6: Count how many times the user's value appears in the array
        int count = 0;
        for (int value : dataPoints) {
            if (value == searchValue) {
                count++;
            }
        }
        System.out.println("The value " + searchValue + " was found " + count + " times in the array.");

        // Task 7: Prompt the user again for a value between 1 and 100 to find the first occurrence
        System.out.print("Enter another value between 1 and 100 to find the first occurrence: ");
        int firstOccurrenceValue = in.nextInt();

        // Find the first occurrence of the value in the array
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == firstOccurrenceValue) {
                position = i;
                break;
            }
        }

        // Display the result with a clear message
        if (position != -1) {
            System.out.println("The value " + firstOccurrenceValue + " was found at array index " + position);
        } else {
            System.out.println("The value " + firstOccurrenceValue + " was not found in the array.");
        }

        // Task 8: Find the minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Display the minimum and maximum values
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }

    // Task 9: Static method to calculate the average
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
