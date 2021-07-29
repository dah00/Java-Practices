import javax.swing.tree.TreeCellRenderer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static TreeNode sortedArrayToBST(int[] nums){
        // Take the middle of the array as the root (sizeArray/2)
        // Fill left side of the Tree

        // if left child is null
            // put next from the left as a left child
        // else
            // rotate: right child = cur / curr = left child / left child = next from left


        TreeNode root = new TreeNode();

        if (nums.length == 1){
            root.val = nums[0];
            return root;
        }

        int rootIndex = nums.length/2;
        root.val = nums[rootIndex];
        TreeNode curr = root;
        Queue<TreeNode> queue = new LinkedList<>();
        //queue.offer(root);
        int index = rootIndex;
        while(index>0){
            if (index == rootIndex){
                root.left = new TreeNode(nums[index-1]);
                curr = root.left;
            }
            else if (curr.left == null){
                curr.left = new TreeNode(nums[index-1]);
            }
            else{
                curr.right = new TreeNode(curr.val);
                curr.val = curr.left.val;
                curr.left.val = nums[index-1];
                queue.offer(curr.left);
                queue.offer(curr.right);
                curr = queue.poll();
            }
            index--;
        }

        index = rootIndex;
        queue.clear();
        while(index<nums.length-1){
            if (index == rootIndex){
                root.right = new TreeNode(nums[index+1]);
                curr = root.right;
            }
            else if (curr.left == null){
                curr.left = curr;
                curr.val = nums[index+1];
            }
            else if (curr.right == null){
                curr.right = new TreeNode(nums[index+1]);
            }else{
                curr.left.left = curr.left;
                curr.left = curr;
                curr = curr.right;
                curr.right.val = nums[index+1];
                queue.offer(curr.left);
                queue.offer(curr.right);
                curr = queue.poll();
            }
            index++;
        }

        return root;
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