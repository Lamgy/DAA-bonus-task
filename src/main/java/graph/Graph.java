package graph;

import java.util.*;

public class Graph {
    private List<String> nodes;
    private List<Edge> edges;

    public Graph(List<String> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<String> getNodes() { return nodes; }
    public List<Edge> getEdges() { return edges; }

    public void addEdge(Edge e) { edges.add(e); }

    public void removeEdge(Edge e) {
        edges.removeIf(edge -> edgeEquals(edge, e));
    }

    private boolean edgeEquals(Edge a, Edge b) {
        return (a.getFrom().equals(b.getFrom()) && a.getTo().equals(b.getTo()) && a.getWeight() == b.getWeight())
                || (a.getFrom().equals(b.getTo()) && a.getTo().equals(b.getFrom()) && a.getWeight() == b.getWeight());
    }
}
