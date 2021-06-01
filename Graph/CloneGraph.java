package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CloneGraph {

    static HashMap<Integer, Node> hm = new HashMap<>();

    static class Node {
        int val;
        List<Node> neghbr;

        Node(int data) {
            this.val = data;
            this.neghbr = new ArrayList<>();
        }

    }

    static void cloneGraph(Node node) {

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(5);
        set.add(3);
        set.add(20);

        System.out.println(set);
    }
}