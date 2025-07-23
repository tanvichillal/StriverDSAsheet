import java.util.*;

class DFS{

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];  
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls); 
        return ls;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v): ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        DFS d1 = new DFS();
        ArrayList<Integer> ans = d1.dfsOfGraph(V, adj);

        System.out.println("DFS Traversal: " + ans);

        sc.close();
    }
}
