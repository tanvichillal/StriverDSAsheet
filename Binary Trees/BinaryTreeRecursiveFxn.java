class Node{
    Node left;
    Node right;
    int data;
    Node(int val){
        this.data = val;
    }
}
public class BinaryTreeRecursiveFxn{

    public static void Preorder(Node node){
        if(node == null){
            return ;
        }

        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
        
    }

    public static void Inorder(Node node){
        if(node == null){
            return ;
        }

       
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
        
    }

    
    public static void Postorder(Node node){
        if(node == null){
            return ;
        }

       
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data + " ");
        
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node (4);
        n.left.right = new Node (5);
        n.left.right.left = new Node(8);
        n.right.left = new Node(6);
        n.right.right = new Node(7);
        n.right.right.left = new Node(9);
        n.right.right.right = new Node(10);
        System.out.print("Preorder Traversal : ");
        Preorder(n);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        Inorder(n);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        Postorder(n);

        
    }
}