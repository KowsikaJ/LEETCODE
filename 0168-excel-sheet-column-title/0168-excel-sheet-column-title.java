class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        StringBuilder sb=new StringBuilder();
        int x=0;
        while(n>0){
            n--;
            x=n%26;
            n=n/26;
            sb.append((char)(x+'A'));

        }
        return sb.reverse().toString();
        
    }
}