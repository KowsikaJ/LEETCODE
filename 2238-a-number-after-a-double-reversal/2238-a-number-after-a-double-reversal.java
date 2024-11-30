class Solution {
    public boolean isSameAfterReversals(int num) {
        int rem=0,rev=0;
        int temp=num;
        for(int i=0;i<2;i++){
            rev=0;
            while(num!=0){
                rem=num%10;
                rev=rev*10+rem;
                num/=10;

            }
            num=rev;
        }
        return (rev==temp);
        
    }
}