class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        Collections.sort(l,(k,m)->(k%2-(m%2)));
        int i=0;
        for(int n:l){
            nums[i++]=n;
        }
        return nums;
    }
}


        /*int k=0;
        int[] nu=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nu[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                nu[k]=nums[i];
                k++;
            }
        }
        return nu;
        */
        
        

 