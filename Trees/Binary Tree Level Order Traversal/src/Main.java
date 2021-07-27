import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static List<List<Integer>> levelOrder(TreeNode root){
        if (root == null)
            return new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> rootlevel = new LinkedList<>(Arrays.asList(root.val));
        list.add(rootlevel);

        Queue<TreeNode> queue = new LinkedList<>();
        if(root.left != null)
            queue.offer(root.left);
        if(root.right != null)
            queue.offer(root.right);

        while(!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            for (TreeNode node: queue){
                level.add(node.val);
            }
            list.add(level);

            Queue<TreeNode> tempQueue = new LinkedList<>();
            for (TreeNode node: queue){
                if (node.left != null)
                    tempQueue.offer(node.left);
                if (node.right != null)
                    tempQueue.offer(node.right);
            }
            queue.clear();
            queue = tempQueue;
        }

        return list;
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