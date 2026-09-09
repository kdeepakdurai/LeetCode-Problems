class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,r=0,l=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<nums.length;i++){
            r=total-l-nums[i];
            if(r==l){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}