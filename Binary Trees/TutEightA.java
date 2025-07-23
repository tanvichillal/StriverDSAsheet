import java.util.Scanner;

public class TutEightA {
    static int graph[][];
    static boolean visited[];
    static int n;
    static mincost = Integer.MAX_VALUE;
    static int bestpath[];


    public static void Adjacency(int vertices , int edgescount , int graph[][]){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<edgescount;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u][v] = w;
            graph[v][u] = w;
        }
        System.out.println("Adjacency Matrix : ");
        for(int i =0;i<vertices;i++){
            for(int j =0;j<vertices;j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
    
public static void tsp(int currentCity , int count ,int cost , int[] path ){
    if(count == n){
        if(graph[currentCity][0] != 0){
            int totalcost = cost + graph[currentCity][0];
            if(totalcost < mincost){
                mincost = totalcost;
                System.arraycopy(path, 0, bestpath, 0, n);
                bestpath[n] = 0;
            }
        }
        return;
    }

    for(int i =0;i<n;i++){
        if(!visited[i] && graph[currentCity][i] != 0){
            visited[i] = true;
            path[count] = i;
            tsp(i , count+1 , cost+graph[currentCity][i] , path);
            visited[i] = false;
        }
    }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of cities");
    n = sc.nextInt();
 System.out.print("Enter number of edges: ");
 int edgesCount = sc.nextInt();
 graph = new int[n][n];
 visited = new boolean[n];
 bestpath = new int[n + 1];
 Adjacency(n, edgesCount, graph);
 
 int[] path = new int[n];
 path[0] = 0;
 visited[0] = true;
 tsp(0, 1, 0, path);
 
 System.out.println("Minimum cost: " + mincost);
 System.out.print("Path: ");
 for (int i = 0; i <= n; i++) {
 System.out.print(bestpath[i] + " ");
 }
 
    
}
}
