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

    public void insert(int val) {
        if (val <= data) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }
}

public class BinarySearchTree {

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
        if (root == null) return -1;
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
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public static void Levelwisedisplay(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                Node currnode = q.poll();
                System.out.print(currnode.data + " ");

                if (currnode.left != null) q.add(currnode.left);
                if (currnode.right != null) q.add(currnode.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter number of elements to insert into BST:");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (root == null) {
                root = new Node(val);
            } else {
                root.insert(val);
            }
        }

        System.out.println("Elements added to BST successfully");
        System.out.print("Inorder Traversal: ");
        Inorder(root);
        System.out.println();

        System.out.println("Enter value to be searched: ");
        int value = sc.nextInt();
        Node ans = search(root, value);
        if (ans != null) {
            System.out.println("The element is present.");
        } else {
            System.out.println("The element is not present.");
        }

        System.out.println("Height of BST: " + Height(root));

        System.out.println("Enter a value to delete from BST: ");
        int deleteVal = sc.nextInt();
        root = delete(root, deleteVal);
        System.out.println("Inorder after deletion: ");
        Inorder(root);
        System.out.println();

        System.out.println("Mirroring BST...");
        root = mirror(root);
        System.out.println("Inorder after mirroring: ");
        Inorder(root);
        System.out.println();

        System.out.println("Level-wise Display:");
        Levelwisedisplay(root);

        sc.close();
    }
}
