class Solution {
public:
    bool isPalindrome(string str){
        int end = str.size()-1;
        int st = 0;

        while(st<=end){
            if(str[st]!=str[end]){
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
    
    void fnx(string s,int idx,int N,vector<string> &v1,vector<vector<string>> &ans){
        if(idx == N){
            ans.push_back(v1);
            return;
        }

        for(int i = idx;i<N;i++){
            string str = s.substr(idx,i-idx+1);

            if(isPalindrome(str)){
                v1.push_back(str);
                fnx(s,i+1,N,v1,ans);
                v1.pop_back();
            }
        }
    }

    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> v1;
        int N = s.size();

        fnx(s,0,N,v1,ans);
        return ans;
    }
};