/*class Solution {
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
*/
class Solution {
    public int secondHighest(String s) {
        int[] arr = new int[10];
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) - '0' <=9 & s.charAt(i)-'0' >=0){
                arr[s.charAt(i)-'0']++;
            }
        }
        boolean first = false;
        for(int i = 9;i>=0;i--){
            if(arr[i] !=0){
                if(first)
                    return i;
                else first = true;
            }
        }
        
        
        return -1;
    }
}