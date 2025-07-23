import java.util.Scanner;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data1){
        this.data  = data1;
        this.right = null;
        this.left = null;

    }

    void insert(int val){
        if(val<= data){
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
    void Insert(int val1){
        if(val1<= data){
            if(left == null){
                left = new Node(val1);
            }
            else{
                left.insert(val1);
            }
        }
        else{
            if(right == null){
                right = new Node(val1);
            }
            else{
                right.insert(val1);
            }
        }
    }
}

public class TwoTreesAreSame {

    public static int Inorder(Node node){
        if(node == null) return -1;
        int left = Inorder(node.left);
        System.out.println(node.data + " ");
        int right = Inorder(node.right);

        return node.data;
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Node root1 = null;
        System.out.println("Enter Elements : ");
        for(int i =0;i<n1;i++){
            int val1 = sc.nextInt();
            if(root1 == null){
                root1 = new Node(val1);
            }
            else{
                root1.Insert(val1);
            }
        }
        int ans1 = Inorder(root1);

        int n2 = sc.nextInt();
        Node root2 = null;
        System.out.println("Enter Elements : ");
        for(int i =0;i<n2;i++){
            int val = sc.nextInt();
            if(root2 == null){
                root2  = new Node(val);
            }
            else{
                root2.insert(val);
            }
        }
        int ans2 = Inorder(root2);

        if(ans1 == ans2) {
            System.out.println("Both trees are same");
        }
        else{
            System.out.println("Different");
        }

    }
    
}
