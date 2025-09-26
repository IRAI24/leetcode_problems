class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]=='0') c[i]='1';
            else c[i]='0';
        }
        return Integer.parseInt(new String(c),2);
    }
}