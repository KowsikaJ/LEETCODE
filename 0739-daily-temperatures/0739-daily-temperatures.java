class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int ind=s.pop();
                res[ind]=i-ind;
            }
            s.push(i);
        }
        return res;  
    }
}