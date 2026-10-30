package Book1;

public class _01Linear {

    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int target =40;
        int result =-1;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] == target){
                result=i;
            }
        }
        System.out.println(result);
    }

}
