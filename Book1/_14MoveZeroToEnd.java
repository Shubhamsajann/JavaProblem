

package Book1;

import java.util.Arrays;

public class _14MoveZeroToEnd {

    public static void main(String[] args) {

        int[] arr = {10, 20, 0, 30, 40, 0};


        int j=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] != 0){
                arr[j]=arr[i];
                j++;
            }
        }

        while (j< arr.length){
            arr[j++]=0;
        }


        System.out.println(Arrays.toString(arr));


    }

}

