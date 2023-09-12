class Solution {
    public int firstMissingPositive(int[] n) 
    {
        int min=100,max=0,l=n.length;
        for(int i=0;i<l;i++)
        {
            if(n[i]>max)
            max=n[i];
            if(n[i]<min&&n[i]>0)
            min=n[i];
        }
        if(min>l)
        return(1);
        while(max>l)
        {
            int max2=0;
            for(int i=0;i<l;i++)
            {
                if(n[i]>max2&&n[i]<max)
                    max2=n[i];
            }
            max=max2;
        } 
        if(min>1||max==0)
        return(1);
        if(max+1<=0)
        max=max-10;
        int[] m=new int[max+1];
        for(int i=0;i<l;i++)
        {
            if(n[i]>0&&n[i]<=max)
            {
                m[n[i]]++;
            }
        }
        for(int i=1;i<=max;i++)
        {
            if(m[i]==0)
            return(i);
        }
        return(max+1);
    }
}