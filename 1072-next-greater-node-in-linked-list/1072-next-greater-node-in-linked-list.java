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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l=new ArrayList<>();
        
        ListNode t=head;
        while(t!=null)
        {
            l.add(t.val);
            t=t.next;
        }
        int[] a=new int[l.size()];int max=0;
        for(int i=0;i<l.size();i++)
        {
            for(int j=i+1;j<l.size();j++)
            {
                if(l.get(j)>l.get(i))
                {
                    a[i]=l.get(j);break;
                }
            }
        }
        //a[l.size()-1]=0;
        return a;
    }
}