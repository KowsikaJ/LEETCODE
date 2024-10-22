class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        Map<Character,Character> m=new HashMap<>();
        m.put(')','(');
        m.put('}','{');
        m.put(']','[');

        for(char c:s.toCharArray()){
            if(m.containsValue(c)){
                st.push(c);
            }
            else if(m.containsKey(c)){
                if(st.isEmpty() || st.pop()!=m.get(c)){
                    return false;
                }
            }
        }
        return st.isEmpty();

        
    }
}