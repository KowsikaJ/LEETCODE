class Solution {
    public String truncateSentence(String s, int k) {
        String newst="";
        for(String st:s.split(" ")){
            if(k==0){
                break;
            }
            newst+=st+" ";
            k--;
        }
        return newst.trim();
        
    }
}