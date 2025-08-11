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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(right==left) return head;
        ListNode temp=head;
   
        int c=1;
        while(temp!=null && left<right)
        {
              if(c>=left && c<=right)
              {
               ListNode temp1=temp;
                for(int i=c;i<right;i++)
                {
                    temp1=temp1.next;
                }
                int val1=temp.val;
                temp.val=temp1.val;
                temp1.val=val1;
                right--;
              }
              c++;
              temp=temp.next;
        } 
         
         




        return head;
    }
}