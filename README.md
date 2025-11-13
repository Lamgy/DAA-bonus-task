# MST Replacement Demo Bonus Task

This project demonstrates building a **Minimum Spanning Tree (MST)** using **Kruskal's algorithm**, removing an edge from the graph, and updating the MST by recomputing it.

---

## Files

- `Edge.java` — Represents a weighted, undirected edge between two nodes.
- `Graph.java` — Stores nodes and edges, with helper methods to add or remove edges.
- `Kruskal.java` — Implements Kruskal's MST algorithm.
- `Main.java` — Demonstrates building the MST, removing an edge, and recomputing the MST.

---

## How It Works

1. Build an MST from the graph using **Kruskal's algorithm**.
2. Display the initial MST edges.
3. Remove a selected edge from the graph.
4. Re-run Kruskal on the updated graph to compute the new MST.
5. Display the updated MST edges.

This approach guarantees that the MST remains minimal and correct after edge removal.

---

## Example Output

Initial MST:\
A - B (1.0)\
B - C (1.5)\
C - D (2.0)\
D - E (5.0)

Removing edge from graph: B - C (1.5)

Updated MST:\
A - B (1.0)\
A - C (3.0)\
C - D (2.0)\
D - E (5.0)

---

## How to Run

1. **Compile all Java files**

```bash
javac *.java
```
2. **Run the demo**

```bash
java Main
```

# Notes

- The MST is recomputed after removing an edge from the graph to ensure correctness.
- Nodes are represented as strings; edges are undirected.
- The project is self-contained and requires only a standard Java environment (JDK 8+).