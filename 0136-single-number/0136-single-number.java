class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}