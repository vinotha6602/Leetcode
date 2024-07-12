
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode q1=head,q2=q1.next;
        while(q2!=null){
            if(q1.val == q2.val){
                q1.next = q2.next;
                q2 = q1.next;
            }
            else{
                q1=q1.next;
                q2=q2.next;
            }
        }

            return head;
    }
}
            