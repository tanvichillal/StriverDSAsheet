import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeNonRecursiveFxn {

    
    public static void Preorder(Node root) {
        if (root == null) {
            return; 
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }

            
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void Inorder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " "); 

            current = current.right;
        }
    }

    public static void Postorder(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        if (root == null) return;

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }


    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        
        System.out.print("Preorder Traversal : ");
        Preorder(root);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        Inorder(root);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        Postorder(root);
    }
}
