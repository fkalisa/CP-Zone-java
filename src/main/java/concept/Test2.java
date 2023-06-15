package concept;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
    public static void main(String[] args) {

        int start = 3;
        int end = 30;

        int arr [] = {2, 5, 5};

        Queue<Object[]> q = new LinkedList<>();
        int result = 0;

        q.add(new Object[]{start, 0});

        while(!q.isEmpty()){
            Object[] current = q.remove();
            int current_step = (int)current[1];
            int current_value = (int)current[0];

            if(current_value == end){
                result = current_step;
                break;
            }

            for (int i = 0; i < arr.length; i++) {
                int tmp = (current_value*arr[i])%100_000;
                q.add(new Object[]{tmp, current_step+1});

            }
        }

        System.out.println(result);

    }
}
