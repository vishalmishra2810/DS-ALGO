class Solution {
    public int countTime(String time) {
        
        int prod = 1;
        
        // if(time.charAt(0) == '?' && time.charAt(1) == '?' && time.charAt(3) == '?' && time.charAt(4) == '?'){
        //     return 1440;
        // }
        
        if(time.charAt(0) == '?'){
            if(time.charAt(1) >= '4'){
                prod *= 2;
            }
            else{
                prod *= 3;
            }   
        }
            
            if(time.charAt(1) == '?'){
                if(time.charAt(0) == '?'){
                    prod = 24;
                }
                else if(time.charAt(0) == '2'){
                    prod *= 4;
                }
                else{
                    prod *= 10;
                }
            }       
                if(time.charAt(4) == '?'){
                    prod *= 10;
                }
                if(time.charAt(3) == '?'){
                    prod *= 6;
                }
        
        
        return prod;
        
    }
}