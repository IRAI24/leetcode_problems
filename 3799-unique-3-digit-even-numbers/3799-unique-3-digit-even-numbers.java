class Solution {
    Set<Integer>set=new HashSet<>();
    public int totalNumbers(int[] digits) {
    boolean[] f=new boolean[digits.length];
        backtrack(digits,f ,new ArrayList<>());
        return set.size();
    }
     void backtrack(int[] arr, boolean[] f,List<Integer> temp)
    {int a=0;
        if(temp.size()==3)
        {
            int no=temp.get(0)*100+temp.get(1)*10+temp.get(2);
            if(temp.get(0)!=0 && temp.get(2)%2==0)
            {
               set.add(no);
            }
            return;
        }
        for( int j=0;j<arr.length;j++)
        {
            if(f[j]==true) continue;
            f[j]=true;
            temp.add(arr[j]);
            backtrack(arr,f,temp);
            
            temp.remove(temp.size()-1);
            f[j]=false;
        }
    }
}