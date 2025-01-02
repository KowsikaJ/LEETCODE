class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0;
        int n=num.length();
        for(int i=0;i<n;i+=2){
            even+=num.charAt(i)-'0';
        }
        for(int i=1;i<n;i+=2){
            odd+=num.charAt(i)-'0';
        }
        return odd==even;
        
    }
}