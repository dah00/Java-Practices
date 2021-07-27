import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        System.out.println(node1 == node2);
    }
    static boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
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
