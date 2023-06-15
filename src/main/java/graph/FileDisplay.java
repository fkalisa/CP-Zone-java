package graph;

import java.util.ArrayList;
import java.util.List;

class Node{
    public String data;
    public int level;
    public List<Node> children;

    public Node(String data, int level){
        this.data = data;
        this.level = level;
        children = new ArrayList<>();
    }


}
public class FileDisplay {



    Node addNode(Node current, String data){

        if(current.children.contains(data));
        return null;
    }



    public static void main(String[] args) {

        String [] arr = {
                "/System/Volumes/private/var/db/cmiodalassistants",
                "/System/Volumes/Data/System/Library/Templates/Data/private/var/db/caches/opendirectory",
                "/System/Data/private/var/at/tabs",
                "/System/Data/private/var/at/tmp",
                "/System/private/var/backups",
                "/System/private/var/agentx"};

        System.out.println(arr.length);


        Node root = new Node("dummy", 0);


        for (String item : arr) {


            String [] splitted = item.split("/");
            Node current = root;

            for(String split : splitted){
                //current.add();
            }

        }



    }
}
