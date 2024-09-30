class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        for(int i=0;i<=2;i++){
            if(m.containsKey(i)){
                int v=m.get(i);
                for(int j=0;j<v;j++){
                    nums[k++]=i;
                }
            }
        }
        
    }
}







        /*HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        for(int i=0;i<=2;i++){
            if(m.containsKey(i)){
                int v=m.get(i);
                for(int j=0;j<v;j++){
                    nums[k++]=i;
                }

            }
            
        }
        
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }
        }
        System.out.println(nums);
    }
    public static void swap(int[] nums,int m,int n){
        int t=nums[m];
        nums[m]=nums[n];
        nums[n]=t;
    }
}
*/