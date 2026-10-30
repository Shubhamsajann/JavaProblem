
package Level1;

//insert element array
public class _37Problem {




    public static void main(String[] args) {

        int[] arr = {10, 20,30,50};


        int insert = 25;
        int index = 2;


        int[] res = new int[arr.length+1];


        for (int i = 0; i <index ; i++) {
            res[i]=arr[i];
        }

        res[index] = insert;

        for (int i = index; i <arr.length ; i++) {
            res[i+1]=arr[i];
        }


        for(int num : res){
            System.out.print(num+" ");
        }



    }
}
