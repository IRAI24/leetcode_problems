class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
         if (indexDiff <= 0 || valueDiff < 0) return false;
        TreeSet<Long> set=new TreeSet<>();
       for(int i=0;i<nums.length;i++)
        {

            long num=nums[i];
            Long cand=set.ceiling(num-(long)valueDiff);
           
            
            if(cand!=null && cand<=num+(long)valueDiff) return true;


            set.add(num);
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }  

            
        }


        return false;
    }
}