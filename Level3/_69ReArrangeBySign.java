package Level3;

public class _69ReArrangeBySign {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, -1, -12, -1, 1, 1, 2};

        int[] result = new int[arr.length];

        int pos = 0;
        int neg = 1;

        for (int num : arr) {

            if (num > 0) {
                result[pos] = num;
                pos += 2;
            }
            else if (num < 0) {
                result[neg] = num;
                neg += 2;
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}