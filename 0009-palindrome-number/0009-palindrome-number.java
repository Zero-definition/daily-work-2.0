class Solution {
    public boolean isPalindrome(int x) {
        int c=x,t=0;
        while(x>0)
        {
            t=t*10+x%10;
            x/=10;
        }
        if(c==t)
        return(true);
        
        return(false);
    }
}