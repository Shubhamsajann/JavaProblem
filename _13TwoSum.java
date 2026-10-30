import java.util.HashMap;

public class _13TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        int[] ans = twoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] twoSum(int[] arr1, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i <arr1.length ; i++) {

            int needed = target-arr1[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};

            }
            map.put(arr1[i],i);
        }

        return new int[]{-1, -1};
       }
}