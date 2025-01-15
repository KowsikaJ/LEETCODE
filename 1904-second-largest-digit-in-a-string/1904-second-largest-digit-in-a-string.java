class Solution {
    public int secondHighest(String s) {
        int max=-1,sec=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>max){
                    sec=max;
                    max=num;
                }
                else if(num>=sec && num!=max){
                    sec=num;
                }
            }


        }
        return sec;
    }
}