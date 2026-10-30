package Level2;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 6;

        // 1. Two Sum variants
        System.out.println("Two-pointer indices: " + Arrays.toString(twoSum(arr, target)));
        System.out.println("HashMap indices: " + Arrays.toString(twoSumHashMap(arr, target)));
        System.out.println("All unique pairs: " + findAllPairs(arr, target));

        // 2. Negative numbers to one side
        int[] mixedNumbers = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Negative numbers left: " + Arrays.toString(negativeNumberOneSide(mixedNumbers)));

        // 3. Dutch National Flag (Sort 0s, 1s, and 2s)
        int[] zerosOnesTwos = {2, 0, 2, 1, 1, 0};
        System.out.println("Sorted 0s, 1s, 2s: " + Arrays.toString(sort012(zerosOnesTwos)));

        // 4. Merge two sorted arrays
        int[] arr1 = {10, 30, 50, 70};
        int[] arr2 = {20, 40, 60, 80};
        System.out.println("Merged sorted arrays: " + Arrays.toString(merge(arr1, arr2)));

        // 5. Union & Intersection
        System.out.println("Union: " + union(arr1, arr2));
        System.out.println("Intersection: " + intersection(arr1, arr2));

        // 6. Three Sum (tested with array containing negative numbers)
        int[] threeSumArr = {-1, 0, 1, 2, -1, -4};
        System.out.println("Three sum triplets: " + threeSum(threeSumArr));
    }

    /**
     * Finds all unique triplets that sum to 0.
     * Time: O(n^2) | Space: O(1) auxiliary (excluding output)
     */
    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        if (arr == null || arr.length < 3) {
            return ans;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > 0) {
                break;
            }
            // Skip duplicate values for the first element
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

    /**
     * Shifts all negative numbers to the left and positive to the right in O(n) time.
     * Time: O(n) | Space: O(1)
     */
    private static int[] negativeNumberOneSide(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }

    /**
     * Dutch National Flag algorithm to sort an array of 0s, 1s, and 2s in-place.
     * Time: O(n) | Space: O(1)
     */
    private static int[] sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    /**
     * Merges two sorted arrays into a new sorted array.
     * Time: O(n + m) | Space: O(n + m)
     */
    private static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        return res;
    }

    /**
     * Returns union of two arrays without duplicates.
     */
    private static List<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        return new ArrayList<>(set);
    }

    /**
     * Returns intersection of two arrays without duplicates.
     */
    private static List<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new LinkedHashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }

    /**
     * Finds indices using Two Pointers on a sorted array.
     * Time: O(n) | Space: O(1)
     */
    private static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * Finds indices using a HashMap on sorted or unsorted arrays.
     * Time: O(n) | Space: O(n)
     */
    private static int[] twoSumHashMap(int[] arr, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    /**
     * Finds all distinct pairs that sum to the target on a sorted array.
     * Time: O(n) | Space: O(1) auxiliary
     */
    private static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                pairs.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;

                while (left < right && arr[left] == arr[left - 1]) left++;
                while (left < right && arr[right] == arr[right + 1]) right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }
}