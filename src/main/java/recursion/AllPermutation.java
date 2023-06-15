package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPermutation {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        compute("abc", "", new ArrayList<>(), result);
        System.out.println("size : " +result.size());
        System.out.println(result);
    }


    static void compute(String input, String current,  List<Integer> indexes, List<String> result){
        if(indexes.size()== input.length()){
            result.add(current);
            return;
        }

        for (int j = 0; j < input.length(); j++) {
            if (!indexes.contains(j)){
                indexes.add(j);
                compute( input,  current + input.charAt(j) ,   indexes, result);
                indexes.remove(indexes.size()-1);
            }
        }
    }
}
