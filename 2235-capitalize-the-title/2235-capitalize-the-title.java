class Solution {
    public String capitalizeTitle(String title) {
        String[] l=title.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String w:l){
            if(w.length()<=2){
                sb.append(w.toLowerCase());
            }
            else{
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
        
            
    }
}