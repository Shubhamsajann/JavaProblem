package Day01;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    static int[] product(int[] arr){

        int[] prefix = new int[arr.length];
        //1  1  2 6

        prefix[0] =1;
        for (int i = 1; i < arr.length; i++) {

            prefix[i]=prefix[i-1]*arr[i-1];
        }

        int[] suffix = new int[arr.length];
        //suffix 24  12 4 1

        suffix[arr.length-1]=1;

        for (int i = arr.length-2 ; i>=0 ; i--) {


suffix[i]=suffix[i+1]*arr[i+1];
        }

        for (int i = 0; i <arr.length ; i++) {

            prefix[i]= prefix[i]*suffix[i];
        }




        return prefix;




    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(product(arr)));



    }
}
