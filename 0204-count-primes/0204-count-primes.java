class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int c=0;

        boolean[] prime=new boolean[n];
        Arrays.fill(prime, true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int mul=i*i;mul<n;mul+=i){
                    prime[mul]=false;
                }

            }
            
        }
        for(boolean p:prime){
            if(p){
                c++;
            }
        }
        return c;
        
        
    }
}