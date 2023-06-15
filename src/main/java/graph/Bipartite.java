package graph;

public class Bipartite {

    public static void main(String[] args) {
        int graph [][] ={{1,2,3}, {0,2}, {0,1,3}, {0,2}};
        int n = graph.length;
        Integer colors[] = new Integer[n];
        colors[0] = 1;
        System.out.println(isBipartite(graph, 0, colors));
    }

    public static boolean isBipartite(int[][] graph, int current, Integer colors [] ){

        for(int  child :  graph[current] ){
            if(colors[child] == null){
                colors[child] = colors[current]*-1;
                if( isBipartite(graph, child, colors) == false){
                    return false;
                }
            }else{
                if(colors[child] == colors[current]){
                    return false;
                }
            }
        }

        return true;
    }
}
