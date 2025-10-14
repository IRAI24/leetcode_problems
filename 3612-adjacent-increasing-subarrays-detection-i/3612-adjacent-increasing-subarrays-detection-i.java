class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
     int c=0;
     if(k==1) return true;
     for(int i=0;i<=nums.size()-2*k;i++)
     {
        boolean f=true;
        for(int j=i+1;j<i+k;j++)
        {
             if(nums.get(j-1)>=nums.get(j))
             {
                f=false;break;
             }
        }
        if(f)
        { 
        for(int j=i+k+1;j<i+2*k;j++)
        {
             if(nums.get(j-1)>=nums.get(j))
             {
                f=false;break;
             }
        }
        if(f) return true;
        }

     }   
     
     return false;
    }
}