import java.util.Scanner;

class Node {
    int data;

    Node right;
    Node left ; 

    Node (int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
        
    }

    public void insert(int val){
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

public static void Inorder(Node node){
    if(node != null){
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
        
    }
}

    public static int Ceil(Node root , int key){
    int ceil = -1;
    while (root != null) {
        if(root.data == key){
            ceil = root.data;
            return ceil;
        }
        if(key > root.data){
            root = root.right;
        }
        else{
            ceil = root.data;
            root = root.left;
        }
    }
    return ceil;

}

public class ceilInBST {
    public static void main(String[] args) {
        6

    }
}
