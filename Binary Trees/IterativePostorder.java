import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Node{
    Node right;
    Node left;
    int data;

    Node(int data1){
        this.data = data1;
        this.right = null;
        this.left  = null;
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
public class IterativePostorder {
    public ArrayList <Integer> postordertraversal(Node root){
        Stack <Node> st1 = new Stack<Node>();
        Stack <Node> st2 = new Stack<Node>();
        ArrayList<Integer> postorder = new ArrayList<Integer>();
        if (root == null) return postorder;
        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }
        return postorder;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of elements : ");
        

        int n = sc.nextInt();
        
    }
}
