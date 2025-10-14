class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
              l.add(words[i]);
                char[] c1=words[i].toCharArray();
                Arrays.sort(c1);
                for(int j=i+1;j<words.length;j++)
                {
                    char[] c=words[j].toCharArray();
                    Arrays.sort(c);
                    if(Arrays.equals(c1,c)) i++;
                    else break;
                }
        }
        return l;
    }
}