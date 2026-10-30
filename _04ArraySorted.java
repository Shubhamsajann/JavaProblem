public class _04ArraySorted {


    public static void main(String[] args) {
        int [] arr = {10,20,30,40,70,60};

        System.out.println(sorted(arr));

    }

    private static boolean sorted(int[] arr) {

        for (int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }

        }
        return true;

    }

}
