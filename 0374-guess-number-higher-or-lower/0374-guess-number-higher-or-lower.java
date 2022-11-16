/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int lower = 0;
        int higher = n;
        
        for(int i = 0; i<=n; i++){
            
            int mid = lower + (higher-lower)/2;
            
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == -1){
                higher = mid - 1;
            }
            else{
                lower = mid + 1;
            }
        }
        
        return -1;
        
    }
}