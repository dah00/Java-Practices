import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(2);
        System.out.println(leftNode == rightNode);
    }
    static boolean isSymmetric(TreeNode root) {
        /* Recursion method*/
        //return helper(root.left, root.right);
        
        /* non-recursion method*/
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();
            if (leftNode == null && rightNode == null) continue;
            if (leftNode == null || rightNode == null) return false;
            if (leftNode.val != rightNode.val) return false;
            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
        }
        return true;
    }

    static boolean helper(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null || rightNode == null)
            return leftNode==rightNode;
        if (leftNode.val != rightNode.val)
            return false;
        return helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left);
    }
}


class TreeNode {
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
