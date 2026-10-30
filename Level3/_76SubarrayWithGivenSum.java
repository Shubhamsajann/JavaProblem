package Level3;

import java.util.HashMap;

public class _76SubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
int left =0;
int sum =0;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
            if(sum > target){
                sum-=arr[left];
                left++;
            }
            if(sum == target){
                System.out.println(
                        "Subarray found from index "
                                + left + " to " + right
                );

                break;
            }
        }

    }



    }
