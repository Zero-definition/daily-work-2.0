class Solution {
    public boolean isPalindrome(int x) {
        if(x>0)
        {
            int a=x,b=0;
            while(a!=0)
            {
                b*=10;
                b+=a%10;
                a/=10;
            }
            if(b==x)
            return true;
            else
            return false;
        }
        else if(x==0)
        return true;
        else
        return false;
    }
}