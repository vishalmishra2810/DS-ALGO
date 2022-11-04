class Solution {
    public String reverseVowels(String s) {
        
        String str = "";
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            
            Character st = s.charAt(i);
            
            if(st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u' || st == 'A' || st == 'E' || st == 'I' || st == 'O' || st == 'U'){
                stack.push(st);
            }
        }
        
        for(int j = 0; j<s.length(); j++){
            
            Character ch = s.charAt(j);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                str += stack.pop();
            }
            else{
                str += ch;
            }
        }
        return str;
        
    }
    
}