import java.util.*;

class Node{
    int data;
    Node right ;
    Node left ;
    Node(int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
    }

    void insert(int val){
        if(val <=data){
            if(left == null){
                left = new Node(val);
            }
            else{
                left.insert(val);
            }
        }
        else{
            if(right == null){
                right = new Node(val);
            }
            else{
                right.insert(val);
            }
        }
    }
}

public class TopViewBT {

    public static ArrayList<Integer> topview (Node root){
        ArrayList <Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer , Integer> map = new TreeMap<>();
        Queue <Pair<Node , Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root ,0)) ;
        while (!q.isEmpty()) {
            Pair <Node  , Integer> pair = q.poll;
            Node node = pair.getKey();
            int line  = pair.getValue();

            if(map.containsKey(line)){
                map.put(line,node.data);
            }
            if(node.left != null){
                q.add(new Pair<>(node.left , line-1));
            }
            
             // Process right child
             if (node.right != null) {
                // Push the right child with an increased
                // vertical position into the queue
                q.add(new Pair<>(node.right, line + 1));
            }
        
        
        // Transfer values from the
        // map to the result list
        for (int value : mpp.values()) {
            ans.add(value);
        }
        
        return ans;
    }}



    public static int Inorder(Node node){
        
        if(node == null) return -1;
            int left = Inorder(node.left);
            System.out.print(node.data + " ");
            int right = Inorder(node.right);
        
            return node.data;
    }
    
}
