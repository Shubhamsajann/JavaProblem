package Level2;

import java.util.TreeSet;

// Merge Sorted Arrays
public class _55Problem {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5};
        int[] arr2 = {2, 4, 6};

        TreeSet<Integer> set =new TreeSet<>();

        for (int i = 0; i <arr1.length ; i++) {
            set.add(arr1[i]);

        }
        for (int i = 0; i <arr2.length ; i++) {
            set.add(arr2[i]);

        }
        System.out.println(set);
    }
}