import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class TutTwo {
        public ArrayList <Integer>  bfs (int v , ArrayList<ArrayList<Integer>> adj){
            ArrayList<Integer> bfs = new ArrayList<>();
            boolean vis[] = new boolean[v];
            Queue <Integer> q = new LinkedList<>();


            q.add(0);
            vis[0] = true;

            while(!q.isEmpty()){
                Integer node = q.poll();
                bfs.add(node);

                for(Integer it :adj.get(node) ){
                    if(!vis[it] ){
                        vis[it] = true;
                        q.add(it);
                    }
                }
            }
            return bfs;
        }

        public ArrayList<Integer> DFS(int v , ArrayList<ArrayList<Integer>>adj){
            ArrayList<Integer> dfs = new ArrayList<>();
            boolean vis[] =  new int[v];
            dfsutil(0,vis , adj , dfs);
            return dfs;

        }

}

