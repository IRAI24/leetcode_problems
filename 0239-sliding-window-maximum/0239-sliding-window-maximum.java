class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int[] arr=new int[nums.length-k+1];
        int max=nums[0];int windSize=1;
        for(int i=0;i<nums.length;i++)
        {   
            max=Math.max(max,nums[i]);
            pre[i]=max;
           if(windSize==k){ max=Integer.MIN_VALUE; windSize=0;}
             windSize++;
        }
       max=Integer.MIN_VALUE;
        int i=nums.length-1;int e=nums.length-(nums.length%k);
       for(;i>=e;i--)
       {
        max=Math.max(max,nums[i]);
            suf[i]=max;
       } 
       max=Integer.MIN_VALUE;windSize=1;
        for(;i>=0;i--)
        {   
            max=Math.max(max,nums[i]);
            suf[i]=max;
           if(windSize==k){ max=Integer.MIN_VALUE; windSize=0;}
             windSize++;
        }

         int a=k-1,b=0,j=0;
         while(a<nums.length && b<nums.length)
         {
            arr[j++]=Math.max(pre[a++],suf[b++]);
            
         }


        return arr;

    }
}