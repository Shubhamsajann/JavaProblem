import java.util.Stack;

public class _27ValidParenthesis {
    public static void main(String[] args) {
        String str  = "{[]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '[') st.push(']');
            else if(ch == '{') st.push('}');
            else if(ch == '(') st.push(')');

            else if(st.isEmpty() || st.pop() != ch) return false;
        }
        return st.isEmpty();
    }


}
