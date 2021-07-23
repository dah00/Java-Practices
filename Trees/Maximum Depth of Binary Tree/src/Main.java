import com.sun.source.tree.Tree;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int maxDepth(TreeNode root){
        // Using DFS
        if (root == null)
            return 0;

        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> values  = new Stack<>();

        nodes.push(root);
        values.push(1);
        int max = 1;

        while(!nodes.empty()){
            TreeNode curr = nodes.pop();
            int temp = values.pop();
            max = Math.max(temp, max);

            if (curr.left != null){
                nodes.push(curr.left);
                values.push(temp+1);
            }
            if (curr.right != null){
                nodes.push(curr.right);
                values.push(temp+1);
            }
        }

        return max;

        // Using recursion call
        /*if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); */


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
