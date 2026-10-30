
package Level1;

import java.util.HashMap;

//find missing element array
public class _40Problem {




    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n= arr.length+1;

int res  = n*(n+1)/2;
int sum =0;
        for (int num : arr){
            sum+=num;
            }

        System.out.println(res-sum);




    }
}
