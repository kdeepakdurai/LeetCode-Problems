class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int n = gain.size();

        int maxi = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    sum += gain[j];
                }
            }

            maxi =max(maxi, sum);
        }

        return maxi;
    }
};