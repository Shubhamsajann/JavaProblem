package Level0;

import java.util.HashSet;

class _17Problem {
    public static void main(String[] args) {

        int[] arr ={10,20,30,30};
        HashSet<Integer> set =new HashSet<>();
        for (int num : arr) {
if(set.contains(num)){
    System.out.println(num);
        }

        else{
            set.add(num);
        }

        }
    }

}