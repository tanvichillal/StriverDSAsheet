import java.util.Scanner;

class Node{
    Node right;
    Node left;
    int data;

    Node (int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
    }
    void insert(int val){
        if(val<=data){
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
public class CheckforBalancedBT {
    public static int height1(Node root){
        if(root == null) return 0;
        int lh = height1(root.left);
        return lh;
        
    }
    public static int height2(Node root){
        if(root == null) return 0;
        int rh = height1(root.right);
        return rh;
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
        int ans1 = height1(root);
        int ans2 = height1(root);
        
        System.out.println(ans1 - ans2);
        
        
    }
    
}
 q q