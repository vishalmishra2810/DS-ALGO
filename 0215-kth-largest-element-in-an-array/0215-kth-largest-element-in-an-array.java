class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        
        for(int val : nums){
            maxHeap.add(val);
        }
        
        while(i != k-1){
            maxHeap.poll();
            i++;
        }
        
        return maxHeap.poll();
        
    }
}