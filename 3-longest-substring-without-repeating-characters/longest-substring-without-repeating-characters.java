class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int currlen=0;
        int i=0;
        int j=-1;
        boolean a[]= new boolean[256];
        while(i<s.length()) {
            char ch_to_aquire = s.charAt(i);
            while(a[s.charAt(i)]==true) {
                j++;
                char ch_to_remove = s.charAt(j);
                a[ch_to_remove] = false;
                currlen--;
            }
            a[ch_to_aquire]=true;
            currlen++;
            i++;
            if(currlen>=maxlen) {
                maxlen=currlen;
            }
        }
        return maxlen;
    }
}