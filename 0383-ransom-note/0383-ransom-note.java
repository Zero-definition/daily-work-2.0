class Solution {
    public boolean canConstruct(String n, String m) {
        int[] map1=new int[26];
        int[] map2=new int[26];
        int l1=n.length();
        int l2=m.length();

        for(int i=0;i<l1;i++)
        {
            map1[n.charAt(i)-97]++;
        }

        for(int i=0;i<l2;i++)
        {
            map2[m.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++)
        {
            if(map1[i]>map2[i])
            return(false);
        }

        return(true);
    }
}