class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        char first = pattern.charAt(0);
        char second = pattern.charAt(1);
        
        long countFirst = 0, countSecond = 0, result = 0;
        
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if(c == first) {
                countFirst++;
            } else if (c == second) {
                countSecond++;
                result += countFirst;
            }
        }
        
        result += Math.max(countFirst, countSecond);
        
        if(first == second) return ((countFirst + 1) * (countFirst) / 2);
        return result;
    }
}