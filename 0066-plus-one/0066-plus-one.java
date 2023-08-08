class Solution {
    public int[] plusOne(int[] d) 
    {
        int l= d.length,c=1;

        for(int i=l-1;i>-1;i--)
        {
            if(c==0)
            break;

            d[i]+=1;
            if(d[i]>9)
                d[i]=0;
            else
                c=0;
        }

        if(c==1)
        {
            int[] d1=new int[l+1];
            d1[0]=1;
            return d1;
        }

        return d;
    }
}