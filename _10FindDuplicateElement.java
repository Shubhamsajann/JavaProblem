public class _10FindDuplicateElement {


    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        int ans = findDuplicate(arr);

        System.out.println(ans);

    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast  = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

        }while (slow != fast);

        while(slow != fast){
            slow = arr[slow];

            fast = arr[fast];
        }
        return slow;
    }
}
