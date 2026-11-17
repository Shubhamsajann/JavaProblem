package Day03;

import java.util.Stack;

public class ValidParenthese {

    static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);

            if(ch == '{'){
                st.push('}');
            } else if (ch == '['  ) {
                st.push(']');

            } else if (ch == '(') {
                st.push(')');

            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                if(st.pop() != ch){
                    return false;

                }
            }

        }
        return true;
    }

    public static void main(String[] args) {


    }
}
