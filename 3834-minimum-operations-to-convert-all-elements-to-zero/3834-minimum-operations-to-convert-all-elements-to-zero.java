class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer>st=new ArrayDeque<>();int c=0;
        for(int i:nums)
        {
            while(!st.isEmpty() && st.peek()>i)
            {
                st.pop();c++;
            }
            if(i==0)continue;
            else if(st.isEmpty() || i!=st.peek()) st.push(i);
        }
       // System.out.println(st);
        return st.size()+c;
    }
}