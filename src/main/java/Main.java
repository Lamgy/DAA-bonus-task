import algorithm.Kruskal;
import graph.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nodes = Arrays.asList("A","B","C","D","E");
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge("A","B",1));
        edges.add(new Edge("A","C",3));
        edges.add(new Edge("B","C",1.5));
        edges.add(new Edge("B","D",4));
        edges.add(new Edge("C","D",2));
        edges.add(new Edge("D","E",5));
        edges.add(new Edge("C","E",6));

        Graph graph = new Graph(nodes, edges);

        List<Edge> mst = Kruskal.run(graph);
        System.out.println("Initial MST:");
        mst.forEach(System.out::println);

        Edge toRemove = mst.get(1);
        System.out.println("\nRemoving edge from graph: " + toRemove);
        graph.removeEdge(toRemove);

        List<Edge> newMst = Kruskal.run(graph);
        System.out.println("\nUpdated MST:");
        newMst.forEach(System.out::println);
    }
}
