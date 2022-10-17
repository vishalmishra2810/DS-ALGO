class Solution {
    public int pivotIndex(int[] nums) {
        
            for(int i=0;i<nums.length;i++)
        {
            int lsum=0,rsum=0;
            
            for(int l=0;l<i;l++)
                lsum+=nums[l];
            
            for(int k=i+1;k<nums.length;k++)
                rsum+=nums[k];
            
            if(lsum==rsum)
                return i;
        }
        return -1;
    }
}