class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int s=0;
        for(int i:arr){
            s+=i;
        }
        if(s%3!=0){
            return false;
        }
        int target=s/3,temp=0,c=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            if(temp==target){
                c++;
                temp=0;

            }
        }
        if(c>=3){
            return true;
        }
        return false;
    }
}