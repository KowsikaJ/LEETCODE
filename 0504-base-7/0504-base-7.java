class Solution {
    public String convertToBase7(int num) {
        int temp=num;
        int sign=0;
        String ans="";
        if(num<0){
            sign=1;
            temp=-num;
        }
        while(temp>=7){
            ans=(temp%7)+ans;
            temp/=7;
        }
        ans=temp+ans;
        if(sign==0){
            return ans;
        }
        else{
            ans="-"+ans;
            return ans;
        }
        
    }
}