package Important_Promnlems;

public class _13MajorityElement {

    public static int majority(int[] arr) {

        int candidate = 0;
        int count = 0;

        for (int x : arr) {

            if (count == 0) {
                candidate = x;
            }

            if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int ans = majority(arr);

        System.out.println(ans);
    }
}