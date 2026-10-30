package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class _20Problem {
    public static void main(String[] args) {

        ArrayList<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);
    }

}