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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
     int[][] a=new int[m][n];
     ListNode temp=head;
     int l=0,r=n-1,t=0,b=m-1;
     for(int i=0;i<m;i++)Arrays.fill(a[i],-1);

     while(temp!=null)
     {
          for(int i=l;i<=r&&temp!=null;i++)
          {
            a[t][i]=temp.val;
            temp=temp.next;
          }t++;
          for(int i=t;i<=b&&temp!=null;i++)
          {
            a[i][r]=temp.val;
            temp=temp.next;
          }r--;
          for(int i=r;i>=l&&temp!=null;i--)
          {
            a[b][i]=temp.val;
            temp=temp.next;
          }b--;
          for(int i=b;i>=t&&temp!=null;i--)
          {
            a[i][l]=temp.val;
            temp=temp.next;
          }l++;

     }   
     return a;
    }
}