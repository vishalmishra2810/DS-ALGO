class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        HashMap<Integer,Integer>map[]=new HashMap[nums.length];
        
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            
            map[i]=new HashMap<>();
            
        }
        int ans=0;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                
                long dif=(long)nums[i]-(long)nums[j];
                
                if(dif>=Integer.MAX_VALUE||dif<=Integer.MIN_VALUE)
                    continue;
                
                int d=(int)dif;
    
                int cnt1=map[i].getOrDefault(d,0);
                
                int cnt2=map[j].getOrDefault(d,0);
                
                ans+=cnt2;
                
                map[i].put(d,cnt2+cnt1+1);
                
             }
        }
        return ans;
        
    }
}