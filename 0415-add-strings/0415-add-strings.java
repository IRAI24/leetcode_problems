class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb=new StringBuilder();

        int e1=num1.length()-1;  int e2=num2.length()-1;int c=0;
        while(e1>=0 || e2>=0 || c!=0)
        {
                   int d1=(e1>=0?num1.charAt(e1)-'0': 0);     
                    int d2=(e2>=0?num2.charAt(e2)-'0': 0);           
                   int num=d1+d2+c;
                   
                   sb.append((num%10)+"");
                   c=num/10;
                   e1--;e2--;
        }
        return sb.reverse().toString();

    }
}