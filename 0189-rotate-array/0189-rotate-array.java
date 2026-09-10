class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        int arr[]=new int[n];
        for(int i = 0; i < d; i++) {
            arr[i] = nums[n - d + i];
        }
        for(int i = n - d - 1; i >= 0; i--) {
            nums[i + d] = nums[i];
        }

        for(int i = 0; i < d; i++) {
            nums[i] = arr[i];
        }

    }
}