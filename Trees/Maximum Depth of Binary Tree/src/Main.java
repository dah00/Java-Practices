import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    TreeNode root = new TreeNode(3);
	    root.left = new TreeNode(9);
	    root.right = new TreeNode(20);
	    root.right.left = new TreeNode(15);
	    root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));

    }

    public static int maxDepth(TreeNode root){
        // Using DFS
/*
if (root == null)
            return 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        int max = 1;

        map.put(stack.push(root), max);

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            int currValue = map.get(curr);
            if (curr.left != null){
                map.put(stack.push(curr.left), currValue+1);
                max = Math.max(max, currValue+1);
                // TODO: find a better way to use currValue
            }
            if (curr.right != null){
                map.put(stack.push(curr.right), currValue+1);
                max = Math.max(max, currValue+1);
                // TODO: find a better way to use currValue
            }
        }

        return max;

*/




/*        if (root == null)
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

        return max;*/

        // Using recursion call
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));


        // Traverse the tree while counting the depth
        // Use Stack to come back to the parent node
    }

    static class TreeNode{
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
