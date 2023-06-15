package binarytree;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("Z","amazi" );
        map.put("A","igi" );
        map.put("K","kibeho" );


        System.out.println(map);


        Map<String, Pair>  map1= new TreeMap<>();

        map1.put("hello", new Pair(10));
        map1.put("nemo", new Pair(1) );

        System.out.println(map1);



       // System.out.println(map1);


    }
}
