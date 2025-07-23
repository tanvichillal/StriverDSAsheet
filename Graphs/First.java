import java.util.*;

class BFS {
    
    public ArrayList<Integer> breadthFirstSearch(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) { 
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    bfs.add(node);

                    for (Integer it : adj.get(node)) {
                        if (!visited[it]) {
                            visited[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter edges (u v) for an undirected graph:");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            adj.get(u).add(v);
            adj.get(v).add(u); 

        }

        
        BFS bfsTraversal = new BFS();
        ArrayList<Integer> result = bfsTraversal.breadthFirstSearch(V, adj);        
        System.out.println("BFS Traversal: " + result);

        sc.close(); 
    }
}
