class Solution {
    public int countPartitions(int[] nums) {
    int c=0;
     //if(nums.length<2)return 1;
     int sum=0;
     for(int i:nums) sum+=i;
     //sum-=nums[i];
     int s1=0;
     for(int i=0;i<nums.length-1;i++)
     {
        sum=sum-nums[i];
        s1+=nums[i];
        if((s1-sum)%2==0)c++;
        //System.out.println(s1-sum+" "+c);
     }
     
     return c;

    }
}