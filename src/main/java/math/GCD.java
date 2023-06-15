package math;

import java.util.ArrayList;

public class GCD {
    /*
        GCD use modulo
        O(log(Min(a, b)))
    */

    public static void main(String[] args) {

        new ArrayList<>(4);

        int a = 10;
        int b = 15;


        while(a!= 0 && b!= 0){
            if (a > b){
                a = a%b;
            }else {
                b =b % a;
            }
        }

        if (a== 0){
            System.out.println("Solution " + b);
        }else{
            System.out.println("Solution " + a);
        }
    }
}
