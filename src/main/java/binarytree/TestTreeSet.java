package binarytree;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {


        Set<String> set = new TreeSet<>();
        set.add("zoe");
        set.add("ava");

        System.out.println(set);

        Set<Pair> set1 = new TreeSet<>();
        set1.add(new Pair(10));

        set1.add(new Pair(1));

    }
}
