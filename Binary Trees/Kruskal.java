import java.util.*;

class Edge implements Comparable<Edge> {
    int u, v, weight;
    Edge(int u, int v, int w) { this.u = u; this.v = v; this.weight = w; }
    public int compareTo(Edge other) { return this.weight - other.weight; }
}
class Union{
    int[] parent , rank;
    Union(int n ){
        parent = new int[n];
        rank = new int[n];
        for(int i =0;i<n;i++){
            parent[i] = i;
        }
    }
    int find(int u){
        if(u!= parent[u]){
            parent[u] = find(parent[u]);
            return parent[u];
        }
    }
    void union(int u, int v){
        int pu = find(u) , pv = find(v);
        if(pu == pv) return;
        if(rank[pu] < rank[pv]) parent[pu] = pv;
        else if(rank[pu] > rank[pv]) parent [pv] = pu;
        else{
            parent[pv] = pu;
            rank[pu]++;
        }
    }
}

class UnionFind {
    int[] parent, rank;
    UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    int find(int u) {
        if (u != parent[u]) parent[u] = find(parent[u]);
        return parent[u];
    }
    void union(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) return;
        if (rank[pu] < rank[pv]) parent[pu] = pv;
        else if (rank[pu] > rank[pv]) parent[pv] = pu;
        else { parent[pv] = pu; rank[pu]++; }
    }
}

public class Kruskal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vertices: ");
        int V = sc.nextInt();
        System.out.print("Edges: ");
        int E = sc.nextInt();

        List<Edge> edges = new ArrayList<>();
        System.out.println("Enter edges (u v weight):");
        for (int i = 0; i < E; i++) {
            edges.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(edges);
        UnionFind uf = new UnionFind(V);
        int cost = 0;
        System.out.println("\nMST edges:");
        for (Edge e : edges) {
            if (uf.find(e.u) != uf.find(e.v)) {
                uf.union(e.u, e.v);
                cost += e.weight;
                System.out.println(e.u + " - " + e.v + " : " + e.weight);
            }
        }
        System.out.println("Total MST cost: " + cost);
    }
}
