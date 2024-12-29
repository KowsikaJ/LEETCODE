class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long l=1,h=num/2;
        while(l<=h){
            long m=l+(h-l)/2;
            long sq=m*m;
            if(num==sq){
                return true;
            }
            else if(sq<num){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return false;
        
    }
}