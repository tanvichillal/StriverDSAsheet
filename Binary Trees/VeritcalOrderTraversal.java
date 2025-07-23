import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.right = null;
        this.left = null;
    }

    void insert(int val){
        if(val <= data){
            if(left ==null){
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

public class VeritcalOrderTraversal {                                     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();                                                                               
    }
}
