package com.rushiraj.HW;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AppTest {

    // Test case for Node Coverage
    @Test
    public void testNodeCoverage() {
        try {
            // Test for handling null array
            App.countOccurrences(null, 'a');
        } catch (IllegalArgumentException e) {
            // Verify that the correct exception is thrown
            assertEquals("Array has to be null or empty", e.getMessage());
        }
    }

    // Test case for Edge Coverage
    @Test
    public void testEdgeCoverage() {
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'a';
        int expected = 3;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }

    // Test case for Edge-Pair Coverage
    @Test
    public void testEdgePairCoverage() {
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'b';
        int expected = 1;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }

    // Test case for Prime Path Coverage
    @Test
    public void testPrimePathCoverage() {
        try {
            // Test for handling null array
            App.countOccurrences(null, 'a');
        } catch (IllegalArgumentException e) {
            // Verify that the correct exception is thrown
            assertEquals("Array has to be null or empty", e.getMessage());
        }
    }

    // Additional test cases

    @Test
    public void testTargetNotInArray() {
        // Test with a valid array and target character 'z' which is not present
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'z';
        int expected = 0; // Expected count should be 0 since 'z' is not present in the array
        int result = App.countOccurrences(array, target);
        // Verify that the result matches the expected count
        assertEquals(expected, result);
    }

    @Test
    public void testTargetAppearsOnce() {
        // Test with a valid array and target character 'c' which appears only once
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'c';
        int expected = 1; // Expected count should be 1 since 'c' appears only once in the array
        int result = App.countOccurrences(array, target);
        // Verify that the result matches the expected count
        assertEquals(expected, result);
    }

   @Test
    public void testEmptyArray() {
    // Test with an empty array and target character 'z'
    char[] emptyArray = {};
    char target = 'z';
    int expected = 0; // Expected count should be 0 since array is empty
    
    try {
        // Invoke the method with the empty array
        int result = App.countOccurrences(emptyArray, target);
        // If no exception is thrown, fail the test
        fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
        // Verify that the correct exception is thrown with the correct message
        assertEquals("Array has to be null or empty", e.getMessage());
    }
}

}

