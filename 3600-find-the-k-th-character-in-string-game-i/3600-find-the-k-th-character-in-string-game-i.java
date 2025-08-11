class Solution {
    public char kthCharacter(int k) {
        
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        while(sb.length()<=k)
        {
            StringBuilder res=new StringBuilder(sb);
            for(int i=0;i<sb.length();i++)
            {
                char c=sb.charAt(i);
                char cs=(c=='z' ? 'a' : (char)(c+1));
                res.append(cs);
            }
            sb=res;

        } 
       
        return sb.charAt(k-1);
    }
}