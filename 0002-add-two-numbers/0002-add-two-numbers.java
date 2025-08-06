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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     List<Integer>L1=new ArrayList<>();
     List<Integer>L2=new ArrayList<>();
     ListNode t1=l1;ListNode t2=l2;
     ListNode dummy=new ListNode(-1);
     ListNode temp=dummy;
     int c=0,n1=0,n2=0;
     while(t1!=null || t2!=null ||c==1)
     {
        if(t1!=null) {n1=t1.val;
        t1=t1.next;}
        
        if(t2!=null){ n2=t2.val;
        t2=t2.next;}
        int s=n1+n2+c;
        c=s/10;
        ListNode t=new ListNode(s%10);
        temp.next=t;
        temp=t;
        n1=0;n2=0;
        
     }
     
     return dummy.next;

    }
}