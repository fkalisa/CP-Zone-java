package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {

        int nums[] = {1,2,3};

        System.out.println("--compute1--");
        List<List<Integer>> result1 = new ArrayList<>();
        compute1(nums, result1, new ArrayList<>(), 0);
        System.out.println(result1);

        System.out.println("--compute2--");
        List<List<Integer>> result2 = new ArrayList<>();
        compute2(nums, result2, new ArrayList<>(), 0);
        System.out.println(result2);
    }

    // using for
    public static void compute1(int[] nums, List<List<Integer>> result, List <Integer> current, int index){

        result.add(new ArrayList(current));
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            compute1(nums, result, current, i+1);
            current.remove(current.size()-1);
        }
    }

    // using pick and not pick
    public static void compute2(int[] nums, List<List<Integer>> result, List <Integer> current, int index) {
        if(nums.length == index){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        compute2(nums, result, current,  index+1);
        current.remove(current.size()-1);
        compute2(nums, result, current,  index+1);
    }
}
