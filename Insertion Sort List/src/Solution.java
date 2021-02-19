public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode cur = head;
        ListNode prev = start;

        // start-> 0 ->  6 -> 5 -> 3 -> 1 -> 8 -> 7
        // prev ->
        //

        while (cur != null) {
            if (cur.next != null && cur.next.val < cur.val) {
                while (prev != null && prev.next.val < cur.next.val)
                    prev = prev.next;
                // insert cur.next before prev

                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp.next = prev.next;
                prev.next = temp;
                prev = start;
            } else
                cur = cur.next;
        }
        return start.next;

    }
}
