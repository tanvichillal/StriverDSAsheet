import java.util.*;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val1){
        this.val = val1;
        TreeNode right = null;
        TreeNode left = null;
    }
}

public class IterativePreorder {
    public List <Integer> preordertraverse (TreeNode root){
        List <Integer> preorder = new ArrayList<Integer>();
        if(root == null) return preorder;
        Stack <TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.empty()) {
            root  = st.pop();
            preorder.add(root.val);
            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        } 
        return preorder;
    }

    public List <Integer> inordertraverse (TreeNode root){
        List<Integer> inorder = new ArrayList<>();
        Stack <TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else {
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.left;
            }
        }
        return inorder;
    }
    public static void main(String[] args) {
        
    }
}
