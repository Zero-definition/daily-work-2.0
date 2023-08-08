class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int temp=s.lastIndexOf(" "),l=s.length();
        return l-temp-1;
    }
}