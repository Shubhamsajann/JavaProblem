package Level0;

import java.util.ArrayList;
import java.util.HashSet;

class _18Problem {
    public static void main(String[] args) {

        int[] arr ={10,20,30,30};
        ArrayList<Integer> list =new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);
        list.remove(Integer.valueOf(10));

        System.out.println(list);



//        list.add(10);              // Add
//        list.get(0);               // Get
//        list.set(0, 50);           // Update
//        list.remove(0);            // Remove by index
//        list.size();               // Size
//        list.contains(30);         // Search
//        list.clear();              // Remove all


    }

}