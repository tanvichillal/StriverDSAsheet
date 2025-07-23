import java.util.*;

class Node {
    int data;
    Node right;
    Node left;
    
    Node(int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
    }
    void insert(int val){
        if(val <= data){
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
public class MIrrorBST {

    public static void Inorder(Node node){
        if(node != null){
            Inorder(node.left);
            System.out.print(node.data + " ");
            Inorder(node.right);
        }
    }
    public static Node mirror(Node root) {
        if (root == null) return null;

        // Swap the left and right children
        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            if(root == null){
                root = new Node(val);
            }
            else{
                root.insert(val);
            }
        }
        mirror(root);
        Inorder(root);
        
    }
}
