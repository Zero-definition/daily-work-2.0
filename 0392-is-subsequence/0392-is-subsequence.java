class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=s.length(),st=t.length(),c=0;
        for(int i=0;i<st;i++)
        {
            if(c==sl)
            return(true);
            if(s.charAt(c)==t.charAt(i))
            {
                c++;
            }
        }
        if(c==sl)
            return(true);
        return(false);
    }
}