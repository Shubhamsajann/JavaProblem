package Level6;

import java.util.ArrayList;
import java.util.List;

public class _145GenerateParenthesis {

    public static  void generate(int n ,int open ,int close, String current){

        if(current.length() == 2*n){
            System.out.println(current);
            return;
        }

        if(open < n){
            generate(n,open+1,close,current+"(");
        }
        if(close<open){
            generate(n,open,close+1,current+")");
        }

    }
    public static void main(String[] args) {
        int n = 3;
        generate(n, 0, 0, "");
    }
}