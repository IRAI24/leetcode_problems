/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int min=Math.min(a,b);int m=0;
            
            for(int i=min+1;i>=1;i--)
            {
                if(a%i==0 && b%i==0) {m=i;break;}
            }
            
            ListNode n=new ListNode(m);
            ListNode t1=temp.next;
            ListNode t2=temp;
            temp=temp.next;
            t2.next=n;
            n.next=t1;
        }
        return head;
    }
}