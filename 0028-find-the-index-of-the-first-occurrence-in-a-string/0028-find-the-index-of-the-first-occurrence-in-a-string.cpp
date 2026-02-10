class Solution {
public:
    int strStr(string haystack, string needle) {
        int h_len = haystack.length(),n_len=needle.length();
        
        for(int i=0;i<=h_len - n_len;++i){
            int j=0;

            while(j < n_len && haystack[i+j] == needle[j]){
                j++;
            }
            if(j == n_len){
                return i;
            }
        }
        return -1;
    }
};