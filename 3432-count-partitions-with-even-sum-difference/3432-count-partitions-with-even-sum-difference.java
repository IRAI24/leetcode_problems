class Solution {
    public int countPartitions(int[] nums) {
    int c=0;
     int sum=0;
     for(int i:nums) sum+=i;     
     int s1=0;
     for(int i=0;i<nums.length-1;i++)
     {
        sum=sum-nums[i];
        s1+=nums[i];
        if((s1-sum)%2==0)c++;
    }
     
     return c;

    }
}