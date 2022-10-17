class Solution {
    public int tribonacci(int n) {
        if (n < 3) {
            return n < 2 ? n : 1;   
        }
        
        int tmp = 0;
        int[] memo = new int[3];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        
        for (int i = 3; i <=n; i++) {
            tmp = memo[2];
            memo[2] = memo[2] + memo[1] + memo[0];
            memo[0] = memo[1];
            memo[1] = tmp;
        }
        
        return memo[2];
    }
}