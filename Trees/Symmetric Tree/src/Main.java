import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
    static boolean isSymmetric(TreeNode root) {
        /* Recursion method*/
        //return helper(root.left, root.right);
        
        /* non-recursion method*/
/*        Queue<TreeNode> queue = new LinkedList<>();
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
        return true;*/







        if(root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            // if child not null put it in both stack and queue
            // else put it in stack only
            if (curr.left != null)
                queue.add(curr.left);
            if (!stack.empty() && stack.peek() == curr.left.val)
                stack.pop();
            // TODO: Check the case when curr.left is null // same for right child
            else
                stack.push(curr.left.val);

            if (curr.right != null)
                queue.add(curr.right);
            if (!stack.empty() && stack.peek() == curr.right.val)
                stack.pop();
            else
                stack.push(curr.right.val);
        }

        if (stack.empty())
            return true;
        return false;





















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
