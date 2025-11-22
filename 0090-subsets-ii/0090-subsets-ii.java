class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        dfs(0,nums,l,new ArrayList<>());
        return l;
    }
    private static void dfs(int i,int[] nums,List<List<Integer>> l,List<Integer> l1)
    {
        
        l.add(new ArrayList<>(l1));
        for(int i1=i;i1<nums.length;i1++)
        {
            if(i1>i && nums[i1]==nums[i1-1]) continue;
            
            l1.add(nums[i1]);
            dfs(i1+1,nums,l,l1);
            l1.remove(l1.size()-1);
        }
        
    }
}