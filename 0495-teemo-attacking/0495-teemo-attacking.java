class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int c=0;
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration<=timeSeries[i+1]){
                c+=duration;
            }
            else{
                c+=(timeSeries[i+1]-timeSeries[i]);
            }
        }
        return c+duration;
        
    }
}