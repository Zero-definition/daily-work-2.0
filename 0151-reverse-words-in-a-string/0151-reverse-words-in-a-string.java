class Solution 
{
    public String reverseWords(String s) 
    {
         s=' '+s;
         s.trim();
         s=' '+s;
         int l=s.length();
         String t="";
         for(int i=0;i<l-1;i++)
         {
             if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
             {
                 t+=' ';
                 for(int j=i+1;j<l;j++)
                 {
                     if(s.charAt(j)==' ')
                     break;
                     t+=s.charAt(j);
                 }
             }
         }
         s=t;
         l=s.length();
         String s1="";
         for(int i=l-1;i>-1;i--)
         {
             if(s.charAt(i)==' ')
             {
                 if(s1!="")
                 s1+=' ';
                 for(int j=i+1;j<l;j++)
                 {
                     if(s.charAt(j)==' ')
                     break;
                     s1+=s.charAt(j);
                 }
             }
         }
         s1.trim();
         return s1;
    }
}