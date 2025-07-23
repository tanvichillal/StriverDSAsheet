import java.util.*;

class Node{
    Node right;
    Node left;
    int data;

    Node(int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
        
    }
    
    void insert(int val){
        if (val <= data){
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
public class LevelWiseTraversal {
    public static void Inorder(Node node){
        if(node != null){
            Inorder(node.left);
            System.out.print(node.data + " ");
            Inorder(node.right);
        }
    }

    public static void Levelwisedisplay(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            
        Node currnode = q.remove();
        if(currnode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(currnode.data + " ");
            if(currnode.left != null){
                q.add(currnode.left);
            }
            if(currnode.right != null){
                q.add(currnode.right);
            }
        }}
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            if(root == null){
                root = new Node(val);
            }
            else{
                root.insert(val);
            }
        }
        System.out.println("Level Wise Display : ");
        Levelwisedisplay(root);
        
    }
}
