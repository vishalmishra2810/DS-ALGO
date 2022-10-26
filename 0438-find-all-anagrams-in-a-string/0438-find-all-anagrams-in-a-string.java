class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> indexes = new ArrayList<>();
        
        HashMap<Character,Integer> pMap = new HashMap<>();
    
    for(char c : p.toCharArray()){
        pMap.put(c, pMap.getOrDefault(c,0)+1);
    }
    HashMap<Character,Integer> sMap = new HashMap<>();
    int windowStart = 0;
    for(int windowEnd = 0; windowEnd<s.length();windowEnd++){
        char c = s.charAt(windowEnd);
    
        sMap.put(c, sMap.getOrDefault(c, 0)+1);
       
        if(windowEnd+1>=p.length()){
          
            if(sMap.equals(pMap)){
                indexes.add(windowStart);
            }
          
            char leftChar = s.charAt(windowStart);
            sMap.put(leftChar, sMap.get(leftChar)-1);
            if(sMap.get(leftChar)==0){
                sMap.remove(leftChar,0);
            }
            windowStart++;

        }
    }
    return indexes;
        
    }
}