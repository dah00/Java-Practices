public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int maxDepth(TreeNode root){
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
