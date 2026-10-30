package Level3;

public class _68MaxConsicativeOnes {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 1, 1, 1, 2};

       int count =0;
       int maxCount =0;


        for (int num : arr) {
            if(num == 1){

                count++;
            }
            else {
                count=0;
            }

    maxCount = Math.max(maxCount,count);
           }

        System.out.println(maxCount);
        }


    }





    

