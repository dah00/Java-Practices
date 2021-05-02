import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while(p!=null){
            stack.push(p.val);
            p = p.next;
        }

        while(head != null){
            if (head.val == stack.pop())
                head = head.next;
            else
                return false;
        }

        return true;
    }


    private class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){ this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
