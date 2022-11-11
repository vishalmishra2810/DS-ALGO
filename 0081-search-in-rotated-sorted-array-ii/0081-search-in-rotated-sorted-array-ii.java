class Solution {
    public boolean search(int[] nums, int target) {
          int l = 0;
        int r = nums.length - 1;
        if ( nums[l]==target || nums[r]==target ) {
            return true;
        }
        while ( l<r && nums[l]==nums[r] ) {
            l++;
            r--;
        }
        if ( nums[l]==target || nums[r]==target ) {
            return true;
        }
        while ( l<=r ) {
            int mid = (l+r)/2;
            int val = ( nums[mid]<nums[0] == target<nums[0] ) ? nums[mid] : target<nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            if ( val<target ) {
                l = mid + 1;
            } else if ( val>target ) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    
}