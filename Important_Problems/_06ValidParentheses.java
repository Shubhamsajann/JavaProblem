package Important_Problems;

import java.util.Stack;

public class _06ValidParentheses {

    public static boolean isValid(String s) {
        // Write your logic here
        if(s==null || s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {


            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            }

            else{
                if(st.isEmpty() || st.pop() !=ch){
                    return false;
                }
            }


        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s)); // Expected: true
    }
}
