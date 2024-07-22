class Solution {

    static ListNode helper(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }
}