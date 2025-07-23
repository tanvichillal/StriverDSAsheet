import java.util.*;

public class BFS {
    
    public ArrayList<Integer> BreadthFirstSearch(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);  // Start BFS from node 0
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (Integer neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            adj.get(u).add(v1);
            adj.get(v1).add(u); // Assuming undirected graph
        }

        BFS obj = new BFS();
        ArrayList<Integer> bfsTraversal = obj.BreadthFirstSearch(v, adj);

        System.out.println("BFS Traversal: " + bfsTraversal);
        sc.close();
    }
}
