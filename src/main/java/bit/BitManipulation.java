package bit;

public class BitManipulation {

    public static void main(String[] args) {
        checkLastBitIsSet(3);
        checkTheIthBitIsSet(14, 3);
    }

    public static void checkTheIthBitIsSet(int a, int i){
        System.out.println("--checkTheIthBitIsSet--");
        // i is the index
        System.out.println(a&(1<<i));
    }

    public static void setTheIthBit(int a, int i){
        System.out.println("--setTheIthBit--");
        // i is the index
        System.out.println(a|(1<< i));
    }
    public static void checkLastBitIsSet(int a){
        System.out.println("--checkLastBitIsSet--");
        System.out.println(a&1);
    }

    public static void checkPowerOfTwo(int a){
        System.out.println("--checkPowerOfTwo--");
        boolean result = (a&(a-1))== 0;
        System.out.println(result);
    }

    public static void checkNumberIsOdd(int a){
        System.out.println("--checkNumberIsOdd--");
        boolean result = (a&1)== 1;
        System.out.println(result);
    }
    public static void checkNumberIsEven(int a){
        System.out.println("--checkNumberIsEven--");
        boolean result = (a&1)== 0;
        System.out.println(result);
    }

    public static void checkDifferenceElement(int a, int b){
        System.out.println("--checkDifferenceElement--");
        System.out.println(a ^ b);
    }
}
