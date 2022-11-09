
class Solution {
    public ListNode swapPairs(ListNode head) {
         if (head == null) {
            return null;
        }
        ListNode f = head;
        ListNode s = head.next;
        if (s == null) {
            return f;
        }
        ListNode temp = s.next;
        s.next = f;
        f.next = swapPairs(temp);
        return s;
    }
}