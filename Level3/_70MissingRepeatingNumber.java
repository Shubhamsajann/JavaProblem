package Level3;

import java.util.HashSet;

public class _70MissingRepeatingNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,2,4,5};

        HashSet<Integer> set = new HashSet<>();
        int repeating =-1;

        for (int num : arr){
            if(set.contains(num)){
                repeating=num;
            }
            else {
                set.add(num);
            }
        }

        int missing =-1;

        for (int i = 1; i <=arr.length; i++) {
            if(!set.contains(i)){
                missing=i;
                break;
            }

        }
        System.out.println(missing);
        System.out.println(repeating);
    }
}