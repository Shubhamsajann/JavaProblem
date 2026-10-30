import java.util.HashSet;

class _20MaxConsicativeNumber {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int maxLength = 0;

        for (int x : set) {

            // Start of a sequence
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

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(arr));
    }
}