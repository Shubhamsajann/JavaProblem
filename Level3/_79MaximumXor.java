package Level3;

import java.util.Arrays;

public class _79MaximumXor {

    public static void main(String[] args) {

        int[] arr = {1, 2,3, 4, 5};


;
        int maxXor = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = i+1; j < arr.length; j++) {

                int xor = arr[i] ^ arr[j];
                maxXor = Math.max(maxXor, xor);
            }

        }
        System.out.println(maxXor);
    }



    }
