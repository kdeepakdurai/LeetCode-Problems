class Solution {
public:
    string addStrings(string num1, string num2) {
        int p1=num1.size()-1,p2=num2.size()-1;
        string ans="";
        int carry=0;
        while(p1>=0 || p2>=0 || carry>0)
        {
            int sum=carry;
            if(p1>=0)
            {
                sum+=num1[p1]-'0';
                p1--;
            }
            if(p2>=0)
            {
                sum+=num2[p2]-'0';
                p2--;
            }
            ans+=char(sum%10 +'0');
            carry=sum/10;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};