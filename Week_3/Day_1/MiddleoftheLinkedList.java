class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null|| head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;

        ListNode head1=head;
        ListNode head2=slow;

        return head2;
    }

}