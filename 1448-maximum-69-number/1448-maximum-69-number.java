class Solution {
    public int maximum69Number (int num) {
     String s=num+"";
     char[] c=s.toCharArray();
     for(int i=0;i<s.length();i++)
     {
        if(c[i]!='9') {
            c[i]='9';
            break;
        }
     }   
     return Integer.parseInt(new String(c));
    }
}