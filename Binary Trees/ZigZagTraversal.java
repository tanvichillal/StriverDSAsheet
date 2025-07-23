class Node{
    Node left;
    Node right;
    int data;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;

    }
    void insert(int val){
        if(val <= data){
            if(left == null){
                left = new Node(val);
            }
            else{
                left.insert(val);
            }
        }else{
            if(right == null){
                right = new Node(val);
            }
            else{
                right.insert(val);
            }
        }
    }
}

public class ZigZagTraversal {
    public static void main(String[] args) {
        
    }
}
