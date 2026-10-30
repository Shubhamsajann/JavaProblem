import java.util.HashMap;

public class _21FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x  : arr){
            map.put(x,map.getOrDefault(x,0)+1);

        }
        System.out.println(map);
    }


}
