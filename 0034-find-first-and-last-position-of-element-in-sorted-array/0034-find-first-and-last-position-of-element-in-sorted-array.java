class Solution {
    public int[] searchRange(int[] n, int t) 
    {
        int x=0;
        int[] ret=new int[2];
        int p=0,s=0,len=n.length,l=len-1;
        if(len==0)
        {
            ret[0]=-1;
            ret[1]=-1;
            return(ret);
        }
        for(int i=s;i<=len;i++)    
        {
            int temp=(s+l)/2;
            if(n[l]==t)
            {
                x++;
                p=l;
                break;
            }
            if(n[temp]==t)
            {
                x++;
                p=temp;
                break;
            }
            else if(n[temp]>t)
            {
                l=temp;
            }
            else
            {
                s=temp;
            }
        }
        int j=p-1;
        s=p;
        l=p;
        for(int i=p;i<len;i++)
        {
            if(n[i]!=t)
            break;
            else
            l=i;
        }
        for(int i=p;i>=0;i--)
        {
            if(n[i]!=t)
            break;
            else
            s=i;
        }
        if(x==0)
        {
            ret[0]=-1;
            ret[1]=-1;
            return(ret);
        }
        ret[0]=s;
        ret[1]=l;
        return(ret);
    }
}