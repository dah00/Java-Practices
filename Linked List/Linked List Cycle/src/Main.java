import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }



    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next = null;
        }
    }
}
