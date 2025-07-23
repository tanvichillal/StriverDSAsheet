class Node{
    int data;
    Node right;
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

public class CheckifaTreeisBSTorBT {
    public static void inorder(Node node){
        if(node != null ){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.left);
        }
    } 
    public boolean isValid(Node root){
        return isValid(root,Long.MIN_VALUE , Long.MAX_VALUE);
    }
        public boolean isValid(Node root , long minval , long maxval){
            if(root == null)
            return true;
            if(root.data >= maxval || root.data <= minval){
                return false;
            }
            return isValid(root.left, minval, root.data) && isValid(root.right, root.data, maxval);
            
        }
}
