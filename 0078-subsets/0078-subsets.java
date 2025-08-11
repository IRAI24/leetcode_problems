class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();

        rec(list,new ArrayList<>(), nums, nums.length , 0);
        return list;
    }
    static void rec(List<List<Integer>> list,List<Integer> temp , int[] nums, int n , int i)
    {
            if(i>=n)
            {
                list.add(new ArrayList<>(temp));
                return;
            }
            rec(list, temp, nums,n,i+1);
            temp.add(nums[i]);
             rec(list, temp, nums,n,i+1);
            temp.remove(temp.size()-1);
    }
}