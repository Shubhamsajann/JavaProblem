package Book1;

public class _10LeaderProblem {

    public static void main(String[] args) {
        int[] arr = {3,2,1};

        System.out.print(arr[arr.length-1]+" ");
        int maxRight = arr[arr.length - 1];

        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>= maxRight){
                maxRight=arr[i];
                System.out.print(maxRight+" ");
            }

        }



    }

}
