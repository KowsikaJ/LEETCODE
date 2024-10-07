class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int ind=0;
        int i=0;
        while(i<n){
            int temp=1;
            char c=chars[i];
            while(i+temp<n && chars[i+temp]==c){
                temp++;
            }
            if(temp==1) chars[ind++]=c;
            else{
                chars[ind++]=c;
                String count=temp+"";
                for(char ch:count.toCharArray()){
                    chars[ind++]=ch;
                }

            }
            i+=temp;

        }
        return ind;
        
    }
}