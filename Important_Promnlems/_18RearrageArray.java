package Important_Promnlems;

public class _18RearrageArray {

    public static int[] rearrangeBySign(int[] arr) {

        int[] ans = new int[arr.length];

        int pos = 0;
        int neg = 1;

        for (int x : arr) {

            if (x > 0) {
                ans[pos] = x;
                pos += 2;
            } else {
                ans[neg] = x;
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, -1, 2, -2, 3, -3};

        int[] result = rearrangeBySign(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}