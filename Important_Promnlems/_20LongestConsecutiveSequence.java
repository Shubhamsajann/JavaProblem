package Important_Promnlems;

import java.util.HashSet;

public class _20LongestConsecutiveSequence {

    public static int longestConsicatev(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int maxLength = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int current = x;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1, 2, 3, 4};

        int result = longestConsicatev(arr);

        System.out.println(result);
    }
}