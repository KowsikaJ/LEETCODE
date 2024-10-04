class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int total=skill[0]+skill[n-1];
        long sum=0;

        for(int i=0;i<n/2;i++){
            if(skill[i]+skill[n-1-i]!=total){
                return -1;
            }
            sum+=(long)skill[i]*skill[n-1-i];

        }
        return sum;
        
    }
}