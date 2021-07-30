import javax.swing.tree.TreeCellRenderer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {-10,-3, 0, 5, 9};
	    sortedArrayToBST(nums);
    }

    static TreeNode sortedArrayToBST(int[] nums){
        // if nums.length  == 1
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }

    static TreeNode helper(int[] nums, int left, int right){
        // base case
        if(left>right)
            return null;
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid-1);
        node.right = helper(nums, mid+1, right);
        return node;
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