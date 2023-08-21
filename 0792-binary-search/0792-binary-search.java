class Solution 
{
    public int search(int[] n, int t) 
    {
        int len=n.length;
        int s=0,l=len;
        if(n[0]==t)
        return(0);
        for(int i=s;i<=l;i++)
        {
            int h=(s+l)/2;
            if(n[h]==t)
            return(h);
            if(n[h]<t)
            s=h;
            else
            l=h;
        }
        return(-1);
    }
}