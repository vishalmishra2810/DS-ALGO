class Solution {
    public int minSteps(String s, String t) {
        
        int ans = 0;
        HashMap<Character, Integer> sFreq = new HashMap();
        HashMap<Character, Integer> tFreq = new HashMap();
        
        for(char ch : s.toCharArray()){
            sFreq.put(ch, sFreq.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : t.toCharArray()){

            tFreq.put(ch, tFreq.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sFreq.entrySet()){
            if(tFreq.containsKey(entry.getKey())){
                int diff = entry.getValue() - tFreq.get(entry.getKey());
                if(diff > 0)
                    ans += diff;
            } else {
                ans += entry.getValue();
            }
        }
        
        return ans;
        
    }
}