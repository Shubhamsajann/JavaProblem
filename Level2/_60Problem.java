package Level2;

import java.util.Arrays;

// Three Sum
public class _60Problem {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {

                // Skip duplicate j
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int l = j + 1;
                int r = arr.length - 1;

                while (l < r) {

                    long sum = (long) arr[i] + arr[j] + arr[l] + arr[r];

                    if (sum == 0) {

                        System.out.println(
                                arr[i] + " " +arr[j]+" "+ arr[l] + " " + arr[r]
                        );

                        l++;
                        r--;

                        // Skip duplicate left values
                        while (l < r && arr[l] == arr[l - 1]) {
                            l++;
                        }

                        // Skip duplicate right values
                        while (l < r && arr[r] == arr[r + 1]) {
                            r--;
                        }

                    } else if (sum < 0) {

                        l++;

                    } else {

                        r--;
                    }
                }
            }
        }
    }
}