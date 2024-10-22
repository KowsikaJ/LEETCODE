class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s=new HashSet<>();
      
        int c=0;
        for(String email:emails){
            StringBuilder sb=new StringBuilder();
           
            int i=0;
            boolean localname=true;
            while(i<email.length()){
                if(localname){
                    if(email.charAt(i)=='+'){
                        while(i<email.length() && email.charAt(i)!='@'){
                            i++;
                        }   
                    }
                    if(email.charAt(i)!='.'){
                        sb.append(email.charAt(i));
                    }
                    if(email.charAt(i)=='@'){
                        localname=false;
                    }
                }
                else{
                    sb.append(email.charAt(i));
                }
                i++;
            }
            
            String e=sb.toString();
            if(!s.contains(e)){
                s.add(e);
                c++;  
            }
            
        }
        return c; 
    }
}