class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int[] res=new int[k];
        int n=arr.length;
        Arrays.sort(arr);
        int med_ind=(n-1)/2;
        int med=arr[med_ind];

        for(int i=0,j=arr.length-1,x=0;x<k;x++){
            if(Math.abs(arr[i]-med) <= Math.abs(arr[j]-med)){
                res[x]=arr[j--];
            }
            else{
                res[x]=arr[i++];
            }
        }
        return res;
        
    }
}