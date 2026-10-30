
package Level1;

import java.util.Arrays;

//copy array
public class _35Problem {


    public static void method1(int[] arr){
        int[] copy = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            copy[i]=arr[i];
        }
        for (int i : copy) {
            System.out.print(i+" ");
        }

    }



    public static void method2(int[] arr){


       int[] copy=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));

    }

    public static void main(String[] args) {

        int[] arr = {10, 20,30};
      method1(arr);
        System.out.println();
        method2(arr);



    }
}
