package Important_Problems;

import java.util.*;

public class _08DailyTemperatures {

//    public static int[] dailyTemperatures(int[] temperatures) {
//        // Write your logic here
//
//        int[] next = new int[temperatures.length];
//
//      for (int i=0;i<temperatures.length-1;i++){
//
//          int day = 0;
//          for (int j = i+1; j < temperatures.length; j++) {
//
//              if(temperatures[j]>temperatures[i]){
//                  day=j-i;
//                  break;
//
//              }
//              else {
//                  day=0;
//              }
//
//          }
//          next[i]=day;
//      }
//      return next;
//    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // Write your logic here

        int n = temperatures.length;

        int[] answer = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int currDay =0;currDay<n;currDay++){

            while (!stack.isEmpty() && temperatures[currDay]>temperatures[stack.peek()]){
                int prevDay = stack.pop();

                answer[prevDay]=currDay-prevDay;
            }
            stack.push(currDay);

        }



        return answer;
    }

    public static void main(String[] args) {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temps);
        System.out.println(Arrays.toString(result));
        // Expected: [1, 1, 4, 2, 1, 1, 0, 0]
    }
}
