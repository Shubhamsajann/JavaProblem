package Level6;

import java.util.ArrayList;
import java.util.List;

public class _144CombinationSum {

    public static void findCombinations(
            int[] arr, int index, int target,
            List<Integer> current,
            List<List<Integer>> result) {

        // Target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // No valid combination
        if (index == arr.length || target < 0) {
            return;
        }

        // Choose the current number
        current.add(arr[index]);

        // Reuse the same number
        findCombinations(
                arr, index, target - arr[index], current, result);

        // Undo the choice
        current.remove(current.size() - 1);

        // Skip the current number
        findCombinations(
                arr, index + 1, target, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        findCombinations(
                arr, 0, target, new ArrayList<>(), result);

        System.out.println(result);
    }
}