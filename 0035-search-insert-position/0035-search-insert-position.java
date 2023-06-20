class Solution {
    public int searchInsert(int[] n, int t) {
        if(t<=n[0])
        return(0);
        int l=n.length,s=0,e=l-1;
        for(int i=s;i<=e;i++)
        {
            int c=(s+e)/2;
            if(n[c]==t)
            {
                return(c);
            }
            else if(n[c]>t)
            e=c;
            else
            s=c;
        }
        if(l==1&&n[0]>t)
        return(0);
        else if(l==1&&n[0]<t)
        return(1);
        if(e==l-1&&n[e]<t)
        return(e+1);
        else if(e==l-1&&n[e]>t)
        return(e);
        return(e);
    }
}