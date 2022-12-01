class Solution {
    public boolean halvesAreAlike(String s) {
        
        String s1 = "";
        String s2 = "";
        
        int n = s.length()/2;
        
        for(int i = 0; i < n; i++){
            s1 += s.charAt(i);
        }
        for(int i = n; i<s.length(); i++){
            s2 += s.charAt(i);
        }
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'||
               s1.charAt(i) == 'o' || s1.charAt(i) == 'u' || s1.charAt(i) == 'A' ||
               s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U'){
                count1++;
            }
        }
        
        for(int i = 0; i<s2.length(); i++){
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i'||
               s2.charAt(i) == 'o' || s2.charAt(i) == 'u' || s2.charAt(i) == 'A' ||
               s2.charAt(i) == 'E' || s2.charAt(i) == 'I' || s2.charAt(i) == 'O' ||s2.charAt(i) == 'U'){
                count2++;
            }
        }
        
        return count1 == count2;
        
    }
}