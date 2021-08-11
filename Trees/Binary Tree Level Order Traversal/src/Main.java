import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    String str = "obed";
	    str.length();
    }

    static List<List<Integer>> levelOrder(TreeNode root){
   /*     List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for (int i=0; i<size; i++){
                TreeNode node = queue.peek();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                level.add(queue.poll().val);
            }
            list.add(level);
        }

        return list;*/


        // store root in the first element of the list
        // Put its children (max 2) in the second element of the list
        // for each children nod of the root, store their children as the 3rd element of the list

        // Scenarios
            // node has two children
            // node has left child only
            // node has right child only
            // node has no child

        List<List<Integer>> list = new LinkedList<>();
        if (root==null)
            return list;
        list.add(new LinkedList<>(Arrays.asList(root.val)));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int nbr = 1;

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            nbr--;
            if (node.left!=null)
                queue.add(node.left);
            if (node.right!=null)
                queue.add(node.right);
            if (nbr==0){
                List<Integer> sublist = new LinkedList<>();
                for (TreeNode element: queue)
                    sublist.add(element.val);
                list.add(sublist);
                nbr = queue.size();
            }
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