import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /**
     * Determine if a given Linked List has a cycle
     * @param head
     * @return true if cycle has occurred, otherwise return false
     */
    private boolean hasCycle(ListNode head) {

        /**
         * Using two pointers:
         *  slow: jump one node at the time
         *  fast: jump two nodes at the time
         *  if there's a cycle the fast pointer will eventually catch the slow pointer
         */
        if(head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;


        /**
         * Store the Node in the set instead of the value of the node
         */
        // Using HashSet
        /*Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;*/
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
