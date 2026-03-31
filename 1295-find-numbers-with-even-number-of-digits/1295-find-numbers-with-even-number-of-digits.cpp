class Solution {
public:
    int findNumbers(vector<int>& nums) {

        int count = 0;

        for(int i = 0; i < nums.size(); i++){

            int digit = 0;
            int n = nums[i];

            if(n < 10){
                digit = 1;
                continue;
            }

            while(n > 0){
                n /= 10;
                digit++;
            }

            if(digit % 2 == 0){
                count++;
            }
        }

        return count;
    }
};