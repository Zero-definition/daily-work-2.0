class Solution {
    public int maxArea(int[] h) {
        int l=h.length,max=0;
        for(int i=0;i<l-1;i++)
        {
            if(h[i]==0)
            continue;
            for(int j=max/h[i];j<l;j++)
            {
                if(h[i]>h[j])
                {
                    int t=h[j]*(j-i);
                    if(max<t)
                    max=t;
                }
                else
                {
                    int t=h[i]*(j-i);
                    if(max<t)
                    max=t;
                }
            }
        }
        return(max);
    }
}