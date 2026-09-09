class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;

        int maxi = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    sum += gain[j];
                }
            }

            maxi = Math.max(maxi, sum);
        }

        return maxi;
    }
}