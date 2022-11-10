class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<Character>();
    
        
        for(char ch: s.toCharArray()) {
            if(!stack.empty() && stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }
        
        String ans = "";
        for(char ch: stack) ans += ch;
        
        return ans;
        
    }
}