class Solution {
    public int[][] generateMatrix(int n) {
        
        int top=0,left=0,bottom=n, right=n;// Setting boundaries
        int [][] x = new int[n][n];
        int num =1;
        
         // travel right
        while(top<bottom&&left<right) {
            for(int i=left;i<right;i++) {
                x[top][i] = num;
                num++;
            }
            top++;
            // travel down
            for(int i = top;i<bottom;i++) { 
                x[i][right-1] = num;
                num++;
            }
            right--;
            
        
            
            if(!(top<bottom && left<right))
                break; 
            // travel left
            for(int i=right-1;i>=left;i--) { 
               x[bottom-1][i] = num;
                num++;
            }
            bottom--;
            //travel up
            for(int i=bottom-1;i>=top;i--) { 
                x[i][left] = num;
                num++;
            }
            left++;
        }
        return x;
    }
}