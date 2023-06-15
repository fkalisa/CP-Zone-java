package stack;

import java.util.Stack;

public class LongestBalancedSubarray {
    /*
    https://www.hackerearth.com/problem/algorithm/little-monk-and-balanced-parentheses-32c6492b/

    you push index, index start at 1
    the stack contains 0, before you loop

    OR

    push -1
    index are normal

    https://leetcode.com/problems/longest-valid-parentheses/
     */
    public static void main(String[] args) {
        //int [] input ={1, -1, 2,3,-2};
        //int [] input ={1, -1, 3, 2,4, -4, -2};
        int [] input ={1, -1, 2,4, -4, -2};
        //int [] input ={1, -1, 2,-2, 4, -4};
        System.out.println(compute(input));
    }

    public static int compute(int [] input){
      int maxi = Integer.MIN_VALUE;
        Stack<Integer> index = new Stack<>();
        index.push(0);
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            if (isOpening(current)){
                index.push(i+1);
            }else {
                if(index.isEmpty()){
                    index.push(i+1);

                }else if ( input[index.peek()-1] == current*-1){
                    index.pop();
                    maxi = Math.max(maxi, i+1 - index.peek());
                }
            }
        }
        return maxi;
    }

    public static boolean isOpening(int input){
        return  input > 0;
    }
}
