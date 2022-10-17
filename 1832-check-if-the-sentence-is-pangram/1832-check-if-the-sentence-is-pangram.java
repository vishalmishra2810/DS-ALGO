class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length() < 26){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<sentence.length(); i++){
            
            if(map.containsKey(sentence.charAt(i))){
                
                map.put(sentence.charAt(i), map.get(sentence.charAt(i)));
            }
            else{
                map.put(sentence.charAt(i), 1);
            }
        }
        
        if(map.size() == 26){
            return true;
        }
        
        return false;
        
    }
}