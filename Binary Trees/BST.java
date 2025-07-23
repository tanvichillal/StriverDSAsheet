import java.util.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data1) {
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
            if (right == null) {
                right = new Node(val);
            }else{
                right.insert(val);
            }
        }
    }

}

public class BST {
    public static void Inorder(Node node) {
        if (node != null) {
            Inorder(node.left);
            System.out.print(node.data + " ");
            Inorder(node.right);
        }
    }

    public static Node search(Node root, int value) {
        while (root != null && root.data != value) {
            root = value < root.data ? root.left : root.right;
        }
        return root;
    }

    public static int Height(Node root) {
        if (root == null) return 0;
        int lh = Height(root.left);
        int rh = Height(root.right);
        return 1 + Math.max(lh, rh);
    }

    public static Node mirror(Node root) {
        if (root == null) return null;
        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    private static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static Node delete(Node root, int key) {
        if (root == null) return null;
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public static void Levelwisedisplay(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currnode = q.remove();
            if (currnode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) {
                    q.add(currnode.left);
                }
                if (currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter no of elements to enter into BST");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (root == null) {
                root = new Node(val);
            } else {
                root.insert(val);
            }
            
        }
        System.out.println("Elements added to BST successfully");
        Inorder(root);
        System.out.println("\nEnter the value to be searched : ");
        int value = sc.nextInt();
        Node ans = search(root, value);
        if (ans != null) {
            System.out.println("The element is present");
        } else {
            System.out.println("The element is not present");
        }

        int result = Height(root);
        System.out.println("Height : " + result);

        System.out.println("Enter the value to be deleted : ");
        int deleteValue = sc.nextInt();
        root = delete(root, deleteValue);
        System.out.println("BST after deletion:");
        Inorder(root);

        System.out.println("\nMirroring the BST:");
        root = mirror(root);
        Levelwisedisplay(root);
    }
}