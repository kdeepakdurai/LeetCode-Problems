class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;

        int left = 0;
        for(int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];
            if(left == right) return i;
            left += nums[i];
        }

        return -1;
    }
}