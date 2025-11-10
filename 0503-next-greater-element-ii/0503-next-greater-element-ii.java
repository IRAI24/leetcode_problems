class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] a=new int[nums.length*2];
        int max=0;
        
        for(int i=0;i<nums.length;i++)
        {
            a[i]=a[i+nums.length]=nums[i];
            //max=Math.max(max,nums[i]);

        }
        int min=0;
       for(int i=0;i<nums.length;i++)
       {
          
           int m=-1;
            for(int j=i+1;j<i+nums.length;j++) 
            if(a[j]>nums[i]){m=a[j];
            break;
            }
            nums[i]=m;
        }
        return nums;
    }
}