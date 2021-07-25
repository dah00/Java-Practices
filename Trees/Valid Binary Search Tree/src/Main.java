import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    static  boolean isValidBST(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();

        nodes.push(root);
        TreeNode curr = null;

        while(!nodes.empty()){
            curr = nodes.pop();
            if (curr.right != null){
                if(curr.val < curr.right.val){
                    nodes.push(curr.right);
                }else
                    return false;
            }if(curr.left != null){
                if (curr.val > curr.left.val){
                    nodes.push(curr.left);
                }else
                    return false;
            }
        }

        return true;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
