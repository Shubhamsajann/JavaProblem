package Important_Promnlems;

import java.util.HashSet;

public class _9FindDuplicates {

    public static void duplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (!set.add(x)) {
                System.out.println("Duplicate: " + x);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 3, 6, 7, 2, 8};

        duplicate(arr);
    }
}