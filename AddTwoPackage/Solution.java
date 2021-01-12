package AddTwoPackage;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        ListNode head = null;
        int hold = 0;

        while (l1.next!=null && l2.next!=null){
            if (l1.next == null)
                l1.next = new ListNode(0, null);                 // add 0 to the list & point l1 to that last 0
            else if (l2.next == null)
                l2.next = new ListNode(0, null);                // add 0 to the list & point l2 to that last 0
            int temp = l1.val + l2.val + hold;

            if (temp/10 != 0){                  // temp has 2 digits
                hold = temp/10;
                temp = temp%10;
            }
            else
                hold = 0;

            if (head == null){             // List is empty
                sum = new ListNode(temp,null);
                head = sum;
            }
            else{
                ListNode newNode = new ListNode(temp);
                newNode.next = sum.next;
                sum.next = newNode;

            }

            sum = sum.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return head;
    }
}
