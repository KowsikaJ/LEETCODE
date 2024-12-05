class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String prev=countAndSay(n-1);
        StringBuilder curr=new StringBuilder();

        char dig=prev.charAt(0);
        int c=0;

        for(int i=0;i<prev.length();i++){
            if(dig==prev.charAt(i)){
                c++;
            }
            else{
                curr.append(c).append(dig);
                c=1;
                dig=prev.charAt(i);
            }
        }
        curr.append(c).append(dig);

        return curr.toString();

        
    }
}