package Level3;

import java.util.ArrayList;
import java.util.HashSet;

public class _73LongestConsicativeSequence {

    public static void main(String[] args) {

        int[] arr = {1, 2,3, 4, 5};

        HashSet<Integer> set = new HashSet<>();



        for (int num : arr) {
            set.add(num);

        }

        int longest= 0;



        for (int num : set) {

            if(!set.contains(num-1)){
                int current = num;
                int count =1;

                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                longest = Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }



    }
