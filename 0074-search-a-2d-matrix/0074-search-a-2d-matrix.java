class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int r=m.length,c=m[0].length, s=0;
        if(r==1)
        {
            for(int j=0;j<c;j++)
            {
                if(m[0][j]==t)
                return(true);
            }
            return(false);
        }
        if(c==1)
        {
            for(int j=0;j<r;j++)
            {
                if(m[j][0]==t)
                return(true);
            }
            return(false);
        }
        for(int i=0;i<r;i++)
        {
            if(m[i][0]==t)
            return(true);
            if(m[i][0]>t)
            {
                if(i!=0)
                i--;
                for(int j=0;j<c;j++)
                {
                    if(m[i][j]==t)
                    return(true);
                }
                return(false);
            }
        }
        for(int j=0;j<c;j++)
        {
            if(m[r-1][j]==t)
            return(true);
        }
        return(false);
    }
}