package Important_Promnlems;

public class _6MoveZeroToEnd {

    public static  int[] moveEnd(int[] arr)
    {


int k=0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!= 0){
               int temp = arr[k];
               arr[k] = arr[i];
               arr[i] = temp;
                k++;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr ={10,0,0,0,30,40,60,50};
      moveEnd(arr);
      for(int i : arr){
          System.out.println(i + " ");
      }

    }
}
