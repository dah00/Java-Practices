import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }

        return null;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
