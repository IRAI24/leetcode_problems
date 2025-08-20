class Solution {
    public int countDigitOne(int n) {
        int  base=1;
        int sum=0;
        while(base<=n)
        {
            int lt=n/base/10;
            int cur=(n/base)%10;
            int rt=n%base;
            if(cur<1)sum+=lt*base;
            else if(cur==1)sum+=lt*base+rt+1;
            else if(cur>1)sum+=(lt+1)*base;
            
            base*=10;
        }
        return sum;
    }
}