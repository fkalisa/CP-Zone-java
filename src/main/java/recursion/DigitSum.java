package recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(134));
    }

    static int sum(int value){
        if (value ==0){
            return 0;
        }
        return value% 10 + sum(value/10);
    }
}
