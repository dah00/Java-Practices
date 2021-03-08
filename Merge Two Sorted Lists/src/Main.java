import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = null;


        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = null;

        ListNode result = mergeTwoLists(l1, l2);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /*
        1st try: Brute force solution
        0ms, 38.5 MB
        O(n)
     */
    /*private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;

        ListNode head = null;
        ListNode tail = null;
        while (l1!=null && l2!=null){
            if (l1.val == l2.val){
                // add l1.val in the output
                ListNode newNode = new ListNode(l1.val, null);
                if (head == null)
                    head = tail = newNode;
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                l1 = l1.next;

                // add l2.val in the output
                newNode = new ListNode(l2.val, null);
                if (head == null)
                    head = tail = newNode;
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                l2 = l2.next;
            }
            else if (l1.val < l2.val){
                // add l1.val in the output
                ListNode newNode = new ListNode(l1.val, null);
                if (head == null)
                    head = tail = newNode;
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                l1 = l1.next;
            }
            else{
                // add l2.val in the output
                ListNode newNode = new ListNode(l2.val, null);
                if (head == null)
                    head = tail = newNode;
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                l2 = l2.next;
            }
        }

        while (l1 != null){
            ListNode newNode = new ListNode(l1.val, null);
            if (head == null)
                head = tail = newNode;
            else{
                tail.next = newNode;
                tail = newNode;
            }
            l1 = l1.next;
        }

        while (l2 != null){
            ListNode newNode = new ListNode(l2.val, null);
            if (head == null)
                head = tail = newNode;
            else{
                tail.next = newNode;
                tail = newNode;
            }
            l2 = l2.next;
        }



        return head;
    }*/




    /*
        2nd try: Using recusion
        1ms,

     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
