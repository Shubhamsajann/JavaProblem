package Level3;

import java.util.Arrays;

public class _80EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {1, 7,3,6,5,6};

        int leftsum = 0;
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {

            int rightsum = totalSum - leftsum - arr[i];
            if (leftsum == rightsum) {
                System.out.println("Equilibrium index: " + i);
                return;
            }
            leftsum += arr[i];
        }

        ;
        System.out.println("No equilibrium index found");

    }

}