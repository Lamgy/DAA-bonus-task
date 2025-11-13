package algorithm;

import graph.*;
import java.util.*;

public class Kruskal {

    public static List<Edge> run(Graph graph) {
        List<Edge> edges = new ArrayList<>(graph.getEdges());
        Collections.sort(edges);

        Map<String, String> parent = new HashMap<>();
        for (String node : graph.getNodes()) parent.put(node, node);

        List<Edge> mstEdges = new ArrayList<>();

        for (Edge e : edges) {
            String root1 = find(parent, e.getFrom());
            String root2 = find(parent, e.getTo());
            if (!root1.equals(root2)) {
                mstEdges.add(e);
                union(parent, root1, root2);
            }
        }

        return mstEdges;
    }

    private static String find(Map<String, String> parent, String node) {
        if (!parent.get(node).equals(node))
            parent.put(node, find(parent, parent.get(node)));
        return parent.get(node);
    }

    private static void union(Map<String, String> parent, String x, String y) {
        parent.put(find(parent, x), find(parent, y));
    }
}
