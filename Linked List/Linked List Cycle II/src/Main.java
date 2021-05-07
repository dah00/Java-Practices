import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public ListNode detectCycle(ListNode head) {
        // O(1) memory
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while(slow != head){
                    slow = slow.next;
                    head = head.next;
                }
                return head;
            }
        }

        return null;

        // My solution
/*
        Set<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }

        return null;*/
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
