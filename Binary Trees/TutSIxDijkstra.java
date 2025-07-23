import java.util.*;

public class TutSIxDijkstra {
    public static void adj(int vertices , int[][] graph, int edgescount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Edges (u v w): ");
        for(int i = 0; i < edgescount; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u][v] = w;
            graph[v][u] = w; // assuming undirected graph
        }

        System.out.println("Adjacency Matrix : ");
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dijkstra(int[][] graph, int vertices , int src){
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];

        Arrays.fill(distance , Integer.MAX_VALUE);
        Arrays.fill(parent , -1);
        distance[src] = 0;

        for(int count = 0; count < vertices - 1; count++){
            int u = -1;
            int minDistance = Integer.MAX_VALUE;

            for(int i = 0; i < vertices; i++){
                if(!visited[i] && distance[i] < minDistance){
                    minDistance = distance[i];
                    u = i;
                }
            }

            if(u == -1) break;
            visited[u] = true;

            for(int v = 0; v < vertices; v++){
                if(graph[u][v] != 0 && !visited[v] && distance[u] + graph[u][v] < distance[v]){
                    distance[v] = distance[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }

        System.out.println("\nShortest distance from source " + src + " : ");
        for(int i = 0; i < vertices; i++){
            System.out.print("Vertex " + i + " : " + distance[i] + " | Path: ");
            printPath(parent, i);
            System.out.println();
        }
    }

    public static void printPath(int[] parent, int j){
        if(j == -1) return;
        printPath(parent, parent[j]);
        System.out.print(j + " ");
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices : ");
        int vertices = sc.nextInt();
        sc.nextLine();
        
        String vertexnames[] = new String[vertices];
        
        for(int i =0;i<vertices;i++){
            System.out.print(i + " : " );
            vertexnames[i] = sc.nextLine();
        }
        int edges = sc.nextInt();
        int[][] graph = new int[vertices][vertices];

        adj(vertices, graph, edges);

        System.out.println("Enter source vertex: ");
        int src = sc.nextInt();
        dijkstra(graph, vertices, src);
    }
}
