
package Level8;

import java.util.Stack;

public class _225ReverseStringUsingStack {

    public static void main(String[] args) {

        String str = "HELLO";
        Stack<Character> stack = new Stack<>();

        // Push each character
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        // Pop characters in reverse order
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
