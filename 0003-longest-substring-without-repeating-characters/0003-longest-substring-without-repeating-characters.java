class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for(int i = 0;i<256;i++){
            hash[i] = -1;
        }
        int n =  s.length();
        int l = 0;
        int r = 0;
        int maxlen = 0;

        while(r<n){
            char ch = s.charAt(r);

            if(hash[ch] != -1 && hash[ch] >= l){
                l = hash[ch] + 1;
            }
            hash[ch] = r;

            int len = r-l+1;
            maxlen = Math.max(maxlen,len);
            r++;

        }
        return maxlen;
    }
}