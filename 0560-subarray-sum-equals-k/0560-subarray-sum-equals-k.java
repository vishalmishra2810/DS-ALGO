class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, 1);
        
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            
            if(hs.containsKey(sum - k)){
                count += hs.get(sum - k);
            }
            hs.put(sum, hs.getOrDefault(sum, 0) + 1);
        }
        return count;
        
    }
}