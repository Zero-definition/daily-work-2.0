class Solution {
    public boolean isValid(String s) {
        String c="";
        int l=s.length();
        if(s.charAt(l-1)=='('||s.charAt(l-1)=='['||s.charAt(l-1)=='{')
            {
                return(false);
            }
        for(int i=0;i<l;i++)
        {
            if(c==""||s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                c=s.charAt(i)+c;
            }
            else if(s.charAt(i)==')')
            {
                if(c.charAt(0)=='(')
                c=c.substring(1,c.length());
                else
                c=s.charAt(i)+c;
            }
            else if(s.charAt(i)=='}')
            {
                if(c.charAt(0)=='{')
                c=c.substring(1,c.length());
                else
                c=s.charAt(i)+c;
            }
            else if(s.charAt(i)==']')
            {
                if(c.charAt(0)=='[')
                c=c.substring(1,c.length());
                else
                c=s.charAt(i)+c;
            }
        }
        if(c=="")
        return(true);
        else 
        return(false);
    }
}