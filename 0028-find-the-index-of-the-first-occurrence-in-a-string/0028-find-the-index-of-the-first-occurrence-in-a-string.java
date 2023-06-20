class Solution {
    public int strStr(String h, String n) {
        int lh=h.length(),ln=n.length(),t=0;
        if(lh==1&&h.charAt(0)=='a')
        return(0);
        for(int i=0;i<lh-ln+1;i++)
        {
            if(h.charAt(i)==n.charAt(0))
            {
                for(int j=1;j<ln;j++)
                {
                    if(n.charAt(j)!=h.charAt(j+i))
                    {
                        t++;
                        break;
                    }
                }
                if(t==0)
                return(i);
                else
                t=0;
            }
        }
        return(-1);
    }
}