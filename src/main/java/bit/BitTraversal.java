package bit;

public class BitTraversal {

    public static void main(String[] args) {

        int m = 8;
        int dup = m;
        while (dup != 0){
           if( (dup&1) == 1){
               System.out.print(1);
           }else{
               System.out.print(0);
           }
            dup = dup >> 1;
        }
    }
}
