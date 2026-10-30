package Level0;

import java.util.*;

public class Practice {

    /**
     * Calculates the factorial of a non-negative integer using recursion.
     * Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */
    public static int factorial(int n) {
        // Base case: 0! = 1 and 1! = 1
        if (n <= 1) {
            return 1;
        }
        // Recursive step: n! = n * (n - 1)!
        return n * factorial(n - 1);
    }

    /**
     * Counts the frequency of each element in an integer array.
     * Returns a map of [number -> occurrence count].
     */
    public static Map<Integer, Integer> frequencyCount(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            // If num exists, increment count; otherwise initialize with 0 + 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    /**
     * Identifies duplicate elements in an integer array while preserving order.
     */
    private static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seenElements = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();

        for (int num : arr) {
            // set.add() returns false if the element is already present
            if (!seenElements.add(num)) {
                duplicateList.add(num);
            }
        }

        return duplicateList;
    }

    public static void main(String[] args) {
        // --- 1. Test Factorial ---
        System.out.println("Factorial of 5: " + factorial(5));

        // --- 2. Test Frequency Count & Duplicates ---
        int[] arr = {10, 20, 30, 40, 40};
        System.out.println("Element Frequencies: " + frequencyCount(arr));
        System.out.println("Duplicate Elements: " + findDuplicates(arr));

        // --- 3. Sorting Primitive Array ---
        // Arrays.sort() modifies the array in-place in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // --- 4. Sorting Collections ---
        // Note: Arrays.asList() creates a fixed-size list; ArrayList makes it fully mutable
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 40, 30, 30, 20, 20, 10, 50, 60, 70));

        // Sort descending using a custom comparator
        numbers.sort((a, b) -> b - a);
        System.out.println("Sorted Descending: " + numbers);

        // Sort ascending using Collections utility
        Collections.sort(numbers);
        System.out.println("Sorted Ascending: " + numbers);
    }
}


