import java.util.*; 

public class Prims{

public static void adjmatrix(int vertices ,int edgecount , int graph[][]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Edges in the format : u v weight");
    for(int i =0;i<edgecount;i++){
        int v = sc.nextInt();
        int u = sc.nextInt();
        int w = sc.nextInt();
        graph[u][v] = w;
        graph[v][u] = w;
        
    }
    System.out.println("Adj Matrix");
    for(int i =0;i<vertices;i++){
        for(int j = 0;j<vertices;j++){
            System.out.print(graph[i][j] + " ");
        }
        
    System.out.println();
        
    }}
    
    public static void prims(int graph[][] , int vertices){
        int distance[] = new int [vertices];
        boolean visited[] = new boolean [vertices];
        int from[] = new int [vertices];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(visited , false);
        Arrays.fill(from , -1);
        distance[0] = 0;
        
        for(int count = 0;count < vertices-1; count++){
            int u = -1;
            int min = Integer.MAX_VALUE;
            for(int i =0;i<vertices;i++){
                if(!visited[i] && distance[i] < min ){
                    min = distance[i];
                    u  = i;
                    
                }
            }
            if(u == -1)break;
            visited[u] = true;
                    
            for(int v =0;v<vertices;v++){
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] < distance[v]){
                    distance[v] = graph[u][v];
                    from[v] = u;
                }
            }
        }
        
        System.out.println("\nMinimum Spanning Tree");
        int totalcost = 0;
        for(int i =1 ;i<vertices;i++){
            if(from[i] != -1){
                System.out.println(from[i] + "-" + i + " : "+ graph[from[i]][i]);
                totalcost += graph[from[i]][i];
            }
        }
        
    }


public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter vertices : ");    
    int vertices = sc.nextInt();
    int graph[][] = new int [vertices][vertices];
    System.out.println("Enter total edges : ");
    int edges = sc.nextInt();
    adjmatrix(vertices , edges,graph);
    prims(graph , vertices);
    
}
}