class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);

            if(st.isEmpty()){
                st.push(cur);
                continue;
            }
            if(cur=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(cur=='D' && st.peek()=='C'){
                st.pop();
            }
            else{
                st.push(cur);
            }
        }
        return st.size();
        
    }
}