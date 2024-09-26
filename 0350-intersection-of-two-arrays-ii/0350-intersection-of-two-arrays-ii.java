class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //List<Integer> r=new ArrayList<>();
        int n=Math.min(nums1.length,nums2.length);
        int[] res=new int[n];
        boolean[] used=new boolean[nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !used[j]){
                    res[k]=nums1[i];
                    k++;
                    used[j]=true;
                    break; //if break is not given the same element at a index is checked with another same element in nums2   
                }
            }
        }
        
        /*int[] ans=new int[k];
        for(int i=0;i<k;i++){
            if(res[i]!=0){
                ans[i]=res[i];
            }
            
        }*/
        
        return Arrays.copyOfRange(res,0,k);
        
    }
}


/*
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];

        // Iterate through nums1
        for (int i = 0; i < nums1.length; i++) {
            // For each element in nums1, find a matching element in nums2 that hasn't been used yet
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    resultList.add(nums1[i]);
                    used[j] = true; // Mark this element as used
                    break; // Break to avoid counting this element multiple times
                }
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
*/
