public class Main {

    public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode pointer = head;
	    pointer.next = new ListNode(2);
	    pointer.next.next = null;

	    ListNode deteled = removeNthFromEnd(head, 2);
    }



    public static ListNode removeNthFromEnd(ListNode head, int n) {
        /**
         * using dummy pointer
         * ex: given linkedList: 1->2->3->4->5->NULL
         * => using dummy(0) 0->1->2->3->4->5->NULL
         *  make dummy point to the head of the list
         */

        // Best solution

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            int length  = 0;
            ListNode first = head;
            while (first != null) {
                length++;
                first = first.next;
            }
            length -= n;
            first = dummy;
            while (length > 0) {
                length--;
                first = first.next;
            }
            first.next = first.next.next;
            return dummy.next;


        // My solution
        /*if(head.next == null && n==1)
            return null;

        ListNode node = head;
        while(node.next != null){
            ListNode nodeCheck = node;
            int i = 1;
            while(i<=n+1 && nodeCheck != null){
                nodeCheck = nodeCheck.next;
                i++;
            }
            if(nodeCheck == null){
                // if node is the head, make the second node as the head
                if(node == head && (i != n+2))
                    head = head.next;
                else{
                    node.next = node.next.next;
                }
                break;
            }
            node = node.next;
        }

        return head;*/
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
