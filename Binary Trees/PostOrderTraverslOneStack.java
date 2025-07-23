import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;



class Node{
    int data ;
    Node left;
    Node right;

    Node (int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
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
}

public class PostOrderTraverslOneStack {

     static List<Integer> postorder(Node node){
        List<Integer> post = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        
        Node curr = node;
        Node lastvisited = null;

        while(curr != null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
            curr = curr.left;
            }
            else{
                    Node temp = st.peek().right;
                    if(temp == null ||temp == lastvisited){
                        temp = st.pop();
                        post.add(temp.data);
                        lastvisited = temp;

                       
                    }
                    else{
                        curr = temp;
                    }
            }


        }
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if(root == null){
                root = new Node(val);
            }
            else{
                root.insert(val);
            }
        }
    }
}
