import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode nine = new TreeNode(9);
        TreeNode seven = new TreeNode(7);
        TreeNode twelve = new TreeNode(12);

        root.left = three;
        root.right = nine;

        three.left = two;
        three.right = four;

        nine.left = seven;
        nine.right = twelve;

        System.out.println(isValidBST(root));

    }

    static boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean helper(TreeNode node, long low, long high){
        if (node == null)
            return true;
        if (node.val <= low || node.val >= high)
            return false;
        return helper(node.left, low, node.val) && helper(node.right, node.val, high);
    }









        /*return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }*/

/*    static boolean helper(TreeNode node, long min, long max){
        if (node == null)
            return true;
        if (node.val<=min || node.val>=max)
            return false;
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }*/


    public static class TreeNode {
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
