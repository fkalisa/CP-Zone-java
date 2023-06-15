package binarytree;

import java.util.*;

public class Main implements Comparable<Main> {


    public static void main(String[] args) {

        Set<int[]> list = new HashSet<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 2});
        System.out.println(list.size());
    }


    @Override
    public int compareTo(Main o) {
        return 0;
    }
}
