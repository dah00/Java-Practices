import com.sun.source.tree.Tree;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); 


        // Traverse the tree while counting the depth
        // Use Stack to come back to the parent node
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){  }
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
