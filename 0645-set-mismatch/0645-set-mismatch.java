class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int dup=0;
        int miss=0;
        for(int num:nums){
            if(set.contains(num)){
                dup=num;
            }
            set.add(num);
        }
        for (int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                miss=i;
                break;
            }
        }
        return new int[]{dup,miss};
    }
}