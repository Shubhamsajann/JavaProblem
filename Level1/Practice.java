package Level1;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 0, 50, 30, 40, 20, 0, 0, 20};

        // --- Math & Aggregates ---
        System.out.println("Sum: " + sumOfArray(arr));
        System.out.println("Average: " + avgOfArray(arr));
        System.out.println("Max: " + maxOfArray(arr));
        System.out.println("Second Max: " + secondMax(arr));

        // --- Counting & Searching ---
        System.out.println("Even & Odd Counts [even, odd]: " + Arrays.toString(countEvenOdd(arr)));
        System.out.println("Frequency of 10: " + countFrequency(arr, 10));
        System.out.println("Contains 0: " + searchElement(arr, 0));
        System.out.println("Linear Search for 30 (index): " + linearSearch(arr, 30));
        System.out.println("Is Sorted: " + isArraySorted(arr));

        // --- Duplicate & Unique Filtering ---
        System.out.println("Duplicate Elements: " + duplicateElements(arr));
        System.out.println("Unique Elements: " + findUniqueElements(arr));

        // --- Structural & Positional Operations ---
        System.out.println("Array Copy: " + Arrays.toString(copyArray(arr)));
        System.out.println("Remove 20: " + Arrays.toString(removeElement(arr, 20)));
        System.out.println("Insert 99 at index 2: " + Arrays.toString(insertElement(arr, 99, 2)));

        // --- In-Place Transformations (pass copies so earlier state isn't destroyed) ---
        System.out.println("Reversed: " + Arrays.toString(reverseArray(arr.clone())));
        System.out.println("Move Zeros to End: " + Arrays.toString(moveZeroesToEnd(arr.clone())));
        System.out.println("Rotated by 2: " + Arrays.toString(rotate(arr.clone(), 2)));

        // Remove duplicates on a sorted array
        int[] sortedTest = {10, 10, 20, 30, 30, 40, 50};
        System.out.println("Remove Duplicates (Sorted): " + Arrays.toString(removeDuplicatesSorted(sortedTest)));

        // Missing number test (1 to n range)
        int[] missingTest = {1, 2, 4, 5};
        System.out.println("Missing Number in [1..5]: " + findMissingNumber(missingTest, 5));
    }

    // ==========================================
    // 1. Math & Aggregate Methods
    // ==========================================

    private static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static double avgOfArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        return (double) sumOfArray(arr) / arr.length;
    }

    private static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    private static int secondMax(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    // ==========================================
    // 2. Counting & Searching
    // ==========================================

    private static int[] countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    private static int countFrequency(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }

    private static boolean searchElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return actual found index
            }
        }
        return -1;
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    // ==========================================
    // 3. Transformation & Array Manipulation
    // ==========================================

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;   // Crucial: increment/decrement to prevent infinite loops
            right--;
        }
    }

    private static int[] reverseArray(int[] arr) {
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] rotate(int[] arr, int k) {
        if (arr.length == 0) return arr;
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        return arr;
    }

    private static int[] moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        return arr;
    }

    private static int[] removeDuplicatesSorted(int[] arr) {
        if (arr.length == 0) return arr;

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        // Return only the distinct sub-array portion
        return Arrays.copyOfRange(arr, 0, uniqueIndex + 1);
    }

    private static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    private static int[] insertElement(int[] arr, int target, int index) {
        if (index < 0 || index > arr.length) throw new IndexOutOfBoundsException();

        int[] result = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        result[index] = target;
        for (int i = index; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    private static int[] removeElement(int[] arr, int target) {
        // Count matches first so the output array is accurately sized
        int matchCount = 0;
        for (int num : arr) {
            if (num == target) matchCount++;
        }

        int[] result = new int[arr.length - matchCount];
        int idx = 0;
        for (int num : arr) {
            if (num != target) {
                result[idx++] = num;
            }
        }
        return result;
    }

    // ==========================================
    // 4. Set & Map Filtering
    // ==========================================

    private static Set<Integer> duplicateElements(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>(); // Keeps duplicates distinct and ordered

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    private static List<Integer> findUniqueElements(int[] arr) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueList.add(entry.getKey());
            }
        }
        return uniqueList;
    }

    private static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
}