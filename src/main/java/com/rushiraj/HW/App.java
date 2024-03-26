package com.rushiraj.HW;

public class App {

    // Method to count occurrences of a target character in an array
    public static int countOccurrences(char[] array, char target) {
        // Variable to store the count of occurrences
        int count = 0;

        // Checking if the array is null or empty
        if (array == null || array.length == 0) {
            // Throwing IllegalArgumentException if the array is null or empty
            throw new IllegalArgumentException("Array has to be null or empty");
        }

        // Iterating through the array to count occurrences of the target character
        for (char c : array) {
            // If the current character matches the target character, increment the count
            if (c == target) {
                count++;
            }
        }
        
        // Returning the total count of occurrences
        return count;
    }
}
