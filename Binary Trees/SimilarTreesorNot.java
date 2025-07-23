class Node{
    int data;
    Node right;
    Node left;

    Node (int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
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

public class SimilarTreesorNot {
    public boolean isSame(Node p , Node q){
        if(p == null || q == null){
            return(p == q);
        }
        return (p.data == q.data) &&  isSame(p.left, q.right) && isSame(p.right, q.left);
    }
    public static void main(String[] args) {
        
    }
}
