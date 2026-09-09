class Solution 
{
public:
    string reverseStr(string s, int k) 
    {
        int n = s.size();
        string res = s;
        for (int i = 0; i < n; i += 2*k)   
        {
            int len = (i + k <= n) ? k : (n - i);   
            for (int j = 0; j < len/2; j++)        
            {
                swap(res[i + j], res[i + len - j - 1]);
            }
        }
        return res;
    }
};