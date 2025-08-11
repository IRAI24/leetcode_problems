class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long mul=1;
        for(int i:nums) mul*=i;
        if(mul!=target*target) return false;

        return rec(nums,0,1,target);
    }
    public static boolean rec(int[] nums,int i, long mul, long target )
    {
        if(mul==target) return true;

        if(mul > target || i==nums.length) return false;
        return rec(nums ,i+1,mul*nums[i],target) ||  rec(nums ,i+1,mul,target);
    }
}