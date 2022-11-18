class Solution {
    public String removeDuplicates(String str, int k) {
        
       int pointer = 0;
        ConcurrentHashMap<Character, Integer> hm = new ConcurrentHashMap<>();
        int count = 0;
        int start=pointer;
        while(str.length() >= k && pointer <= str.length()){

            if((pointer-start) == k && hm.size() != 1){
                int freq = hm.get(str.charAt(start));
                freq-=1;
                if(freq==0)
                    hm.remove(str.charAt(start));
                else
                    hm.put(str.charAt(start),freq);
                start+=1;
            } else if((pointer-start) == k && hm.size() == 1){
                if(start>0){
                    str = str.substring(0,start) + str.substring(pointer);
                } else {
                    str = str.substring(pointer);
                }
                hm.clear();
                pointer = Math.max((pointer - (2 * k - 1)), 0);
                start = pointer;
            }


            if(pointer > str.length() - 1)
                break;

            char currChar = str.charAt(pointer);
            if(hm.containsKey(currChar)){
                int freq = hm.get(currChar);
                freq+=1;
                hm.put(currChar,freq);
            } else {
                hm.put(currChar, 1);
            }

            pointer+=1;

        }

        return str;
        
    }
}