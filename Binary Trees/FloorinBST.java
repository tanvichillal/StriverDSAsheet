import java.util.Scanner;

class Node{

    int data;
    Node right ;
    Node left;
    Node(int data1){
        this.right = null;
        this.left = null;
        this.data = data1;
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
public class FloorinBST {


    public static int floor(Node root ,int key){
        int floorval = -1;
        while(root != null){
            if(key == root.data){
                floorval = root.data;
                return floorval;
            }
            if(root.data < key){
                floorval = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }


        }
        return floorval;
    }

    public static void Inorder(Node node){
        if(node != null){
            Inorder(node.left);
            System.out.print(node.data + " ");
            Inorder(node.right);
        }

    }

    public static int Height(Node root){
        if(root == null) return 0;
        int lh = Height(root.left);
        int rh = Height(root.right);
        return 1 + Math.max(lh, rh);
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
        System.out.print("Key : ");
        int key  = sc.nextInt();
        int ans = floor(root, key);
        System.out.println(ans);
        System.out.println("Inorder Display : ");
        Inorder(root);
        System.out.println();
        int result = Height(root);
        System.out.println("Height : "+result);
    }
}
