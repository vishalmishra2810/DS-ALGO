class Solution {
    public int calculate(String s) {
        
        int res = 0;
	if (s == null || s.length() == 0) return res;

	Stack<Character> operators = new Stack<>();
	char oper = '+', currChar;
	int currNum = 0; 

	for (int i = 0; i < s.length(); i++) {
		currChar = s.charAt(i); 
		// calculates current numbers
		if (Character.isDigit(currChar)) {
			currNum = currNum * 10 + (currChar - '0'); 
		}
		// adds numbers to result 
		if (isOperator(currChar) || i == s.length() - 1) {
			res = oper == '+' ? res + currNum : res - currNum;
			// if there is no precedent (, use the current operator
			if (operators.isEmpty()) {
				oper = currChar;
			} else {
				// compares previous and current operator if there is at least one precedent (
				oper = currChar == operators.peek() ? '+' : '-';
			}
			// reset num
			currNum = 0; 
		} else if (currChar == '(') {
			// memorizes the most recent operator
			operators.push(oper);
		} else if (currChar == ')') {
			// one part of the calculation is done, pop from stack
			operators.pop();
		}
	}
	return res; 
}

private boolean isOperator(char c) {
	return c == '+' || c == '-';
    }
}