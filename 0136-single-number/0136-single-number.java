class Solution {
    public int singleNumber(int[] c) {
        int l=c.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                {
                    c[i]=0;
                    c[j]=0;
                }
            }
        }

        for(int i=0;i<l;i++)
        {
            if(c[i]!=0)
            return(c[i]);
        }
        return(0);
    }
}