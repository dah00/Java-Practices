public class Main {

    public static void main(String[] args) {

    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
    }

    private class ListNode {
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
}
