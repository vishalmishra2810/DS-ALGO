class Solution {
    public int jump(int[] nums) {
        
        int jump = 0;
		int left = 0;
		int right = 0;
		//till we reach end of the array
		while (right < nums.length - 1) {
			int max = 0;
			//find max reach (in range of indexes left and right)
			for (int i = left; i <= right; i++) {
				max = Math.max(nums[i] + i, max);
			}
			//update new boundaries
			left = right + 1;
			right = max;
			jump++;
		}
        
        return jump;
        
    }
}