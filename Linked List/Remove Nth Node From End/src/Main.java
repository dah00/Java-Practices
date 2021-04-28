public class Main {

    public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    ListNode pointer = head;
	    pointer.next = new ListNode(2);
	    pointer.next.next = null;

	    ListNode deteled = removeNthFromEnd(head, 2);
    }



    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null && n==1)
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

        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
