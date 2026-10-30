package Level3;

public class Practice {

    public static void main(String[] args) {

        String s = "shubham";



    }
     public void reverseString (String s){
            int left = 0;
            int right = s.length() - 1;


            while (left < right) {
                char[] c = s.toCharArray();

                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;

            }


        }

    }

