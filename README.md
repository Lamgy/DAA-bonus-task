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

## ▶️ How to Run

### 🧩 Option 1 — Run in IntelliJ IDEA (Recommended)
1. Open the project folder (`DAA-bonus-task`) in **IntelliJ IDEA**.
2. Open `Main.java`.
3. Click the **green ▶️ Run** button next to the `main()` method or in the top toolbar.

That’s it — IntelliJ will compile and run the project automatically.

---

### 💻 Option 2 — Run from Command Line

Make sure you have the **JDK (Java Development Kit)** installed and available in your PATH.

#### 🪟 On Windows / macOS / Linux:
From the **project root** (where `src/` is located), run:

```bash
javac -d out src/main/java/graph/*.java src/main/java/algorithm/*.java src/main/java/Main.java
```

Then run:
```bash
java -cp out Main
```

---

# Notes

- The MST is recomputed after removing an edge from the graph to ensure correctness.
- Nodes are represented as strings; edges are undirected.
- The project is self-contained and requires only a standard Java environment (JDK 8+).