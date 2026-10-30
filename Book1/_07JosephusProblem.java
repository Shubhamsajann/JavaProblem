package Book1;

public class _07JosephusProblem {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

     int result = 0;
     int k=2;
     for (int i=2;i<=arr.length;i++){
         result = (result+k)%i;
     }

        System.out.println(result+1);
    }

}
