class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted=new int[score.length];
        String[] ans=new String[score.length];

        for(int i=0;i<score.length;i++)
        {
            sorted[i]=score[i];
        }
        Arrays.sort(sorted);

        for(int i=score.length-1;i>=0;i--){
            int p=score.length-binarysearch(sorted,score[i]);
            if(p==1){
                ans[i]="Gold Medal";
            }
            else if(p==2){
                ans[i]="Silver Medal";
            }
            else if(p==3){
                ans[i]="Bronze Medal";
            }
            else{
                ans[i]=String.valueOf(p);
            }
        }
        return ans;
        
    }
    public static int binarysearch(int[] sorted,int target){
        int l=0,h=sorted.length-1;

        while(l<=h){
            int mid=l+(h-l)/2;

            if(sorted[mid]==target){
                return mid;
            }
            else if(sorted[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}