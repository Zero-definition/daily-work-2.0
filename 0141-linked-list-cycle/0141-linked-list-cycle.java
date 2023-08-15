/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1=new ListNode();
        ListNode p2=new ListNode();
        p1=head;
        p2=head;

        while(p1!=null)
        {
            if(p1==null)
            return(false);
            p1=p1.next;
            for(int i=0;i<100000;i++)
            {
                if(p2==null)
                return(false);
                p2=p2.next;
            }
            if(p1==p1)
            return(true);
        }
        return(false);
    }
}