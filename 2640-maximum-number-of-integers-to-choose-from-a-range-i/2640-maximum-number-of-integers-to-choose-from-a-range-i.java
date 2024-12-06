class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            s.add(banned[i]);
        }
        int sum=0,c=0;

        for(int i=1;i<=n;i++){
            if(s.contains(i)){
                continue;
            }
            sum+=i;
            if(sum>maxSum){
                break;
            }
            c++;

        }
        return c;
    }
}