package Day03;

import java.util.Stack;

public class NextGreaterElement {

    static int[] nextGreaterElement(int[] arr) {

        Stack<Integer> st =  new Stack<>();
        int[] res = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {

            while(!st.isEmpty() &&  st.peek()<= arr[i]){

                st.pop();
            }

            if(st.isEmpty()){
                res[i]=-1;
            }
            else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }

return res;
    }

    public static void main(String[] args) {

    }

}
