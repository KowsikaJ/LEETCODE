class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int hind=0;

        for(int i=0;i<n;i++){
            int h=n-i;
            if(citations[i]>=h){
                hind=h;
                break;
            }
        }
        return hind;
        
    }
}