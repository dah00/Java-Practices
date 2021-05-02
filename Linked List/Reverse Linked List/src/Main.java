import java.util.Stack;

public class Main {

    public static void main(String[] args){


        ListNode head = new ListNode(1);
        ListNode node = head;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(4, null);

        ListNode reversedHead = reverseList(head);
    }


    /**
     * Given the head of a singly linked list, reverse the list
     * @param head
     * @return head
     */
    private static ListNode reverseList(ListNode head) {
        // Recursive way
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

        // iterative way 2
        /*ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;*/

        // Iterative way 1
        /*Stack<Integer> stack = new Stack<>();
        ListNode pointer = head;

        while (pointer != null){
            stack.push(pointer.val);
            pointer = pointer.next;
        }

        pointer = head;
        while(pointer != null){
            pointer.val = stack.pop();
            pointer = pointer.next;
        }

        return head;*/
    }


    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
}

