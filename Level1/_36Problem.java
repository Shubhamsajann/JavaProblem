
package Level1;

import java.util.Arrays;

//remove element array
public class _36Problem {




    public static void main(String[] args) {

        int[] arr = {10, 20,30,40,50};

        int remove = 30;

        int[] res = new int[arr.length-1];

        int j=0;

        for (int num : arr){
            if(num!=remove){
                res[j] = num;
                j++;
            }
        }
        for (int num : res){
            System.out.print(num+" ");
        }



    }
}
