public class _18RearrangeBySign {

    // + - + -
    public static void main(String[] args) {

        int[] arr = {-2, -0, 2, -1, 1, 0};

        rearrange(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    private static int[] rearrange(int[] arr) {

        int[] ans = new int[arr.length];

        int positive = 0;
        int negative = 1;

        for (int x : arr){

            if(x>0){
                ans[positive] = x;
                positive+=2;
            }
            else {
                ans[negative] = x;
                negative+=2;
            }
        }
        return ans;
    }
}
