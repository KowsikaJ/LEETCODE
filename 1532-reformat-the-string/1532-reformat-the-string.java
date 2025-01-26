class Solution {
    public String reformat(String s) {
        List<Character> nums=new ArrayList<>();
        List<Character> alpha=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                nums.add(s.charAt(i));
            }
            else{
                alpha.add(s.charAt(i));
            }
        }
        if(Math.abs(nums.size()-alpha.size())>1) return "";

        StringBuilder sb=new StringBuilder();
        if(nums.size()>=alpha.size()){
            for(int i=0;i<nums.size();i++){
                sb.append(nums.get(i));

                if(i<alpha.size()){
                    sb.append(alpha.get(i));
                }
            }
        }
        else{
            for(int i=0;i<alpha.size();i++){
                sb.append(alpha.get(i));

                if(i<nums.size()){
                    sb.append(nums.get(i));
                }
            }

        }
        return sb.toString();
    }
}