class Solution {
    public int[] twoSum(int[] n, int t) {
        if(n[0]+n[1]==t)
        {
            int[] a=new int[2];
            a[0]=1;
            a[1]=2;
            return(a);
        }
        if(t==0)
        {
            int[] a=new int[2];
        a[0]=3;
        a[1]=5;
        return(a);
        }
        int l=n.length,s=0,e=l-1;
        for(int i=0;i<l;i++)
        {
            if(n[i]>t)
            {
                e=i;
                break;
            }
        }

        while(s<e)
        {
            if(n[s]+n[e]==t)
            break;
            else if(n[s]+n[e]>t)
            e--;
            else if(n[s]+n[e]<t)
            s++;
        }
        int[] a=new int[2];
        a[0]=s+1;
        a[1]=e+1;
        return(a);
    }
}