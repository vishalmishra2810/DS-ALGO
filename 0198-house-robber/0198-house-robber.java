class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int dp[] = new int[nums.length];
        
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i<nums.length; i++){
            int third = Math.max(second, nums[i] + first);
                first = second;
                second = third;
        }
        return second;
        
    }
}