package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeTreeBipartite {
    /*
    by adding edges
    a tree is never bipartite because no cycle
    existing edges in tree : N-1
    the solution is : (Black * White)-(N-1)

     */

    public static void main(String[] args) {
        int n = 5;
        int [] [] edges = {{1, 2}, {1, 3}, {2, 4}, {2, 5}};

        Map<Integer, List<Integer>> graph = createGraph(edges);
       int blacks = countBlacks(graph, 1, -1, 1);

       int result = (blacks *(n-blacks))-(n-1);

        System.out.println(result);

    }

    public static int countBlacks( Map<Integer, List<Integer>> graph, int current, int parent, int color) {

        int blacks = color;

        for (int child:graph.get(current)) {
            if(child != parent){
                blacks = blacks+ countBlacks(graph, child, current, color == 0? 1: 0)  ;
            }

        }

        return blacks;
    }

    public static Map<Integer, List<Integer>> createGraph(int [] [] edges){
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int [] edge: edges) {
            int v = edge[0];
            int u = edge[1];
            map.computeIfAbsent(v, (k) -> new ArrayList<>());
            map.computeIfAbsent(u, (k) -> new ArrayList<>());

            map.get(u).add(v);
            map.get(v).add(u);

        }
        return map;
    }
}
