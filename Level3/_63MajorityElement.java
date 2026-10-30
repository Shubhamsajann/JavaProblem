package Level3;

public class _63MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,2,2};

        int cand = 0;
        int count =0;

        for(int num : arr){
            if(count == 0){
                cand=num;
            }
            else if(cand ==num){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(cand);
    }
}
