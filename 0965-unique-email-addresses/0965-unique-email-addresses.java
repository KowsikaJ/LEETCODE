/*class Solution {
    public int numUniqueEmails(final String[] emails) {
        final Set<String> set = new HashSet<>();
        int count = 0;

        for(final String email : emails) {
            final StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean isLocalName = true;

            while(i < email.length()) {
                if(isLocalName) {
                    if(email.charAt(i) == '+')
                        while(i < email.length() && email.charAt(i) != '@')
                            i++;

                    if(email.charAt(i) != '.')
                        sb.append(email.charAt(i));

                    if(email.charAt(i) == '@')
                        isLocalName = false;
                } else {
                    sb.append(email.charAt(i));
                }

                i++;
            }

            final String e = sb.toString();

            if(!set.contains(e)) {
                set.add(e);
                count++;
            }
        }

        return count;
    }
}
*/










class Solution {
    public int numUniqueEmails(String[] emails) {
        final Set<String> s=new HashSet<>();
      
        int c=0;
        for(final String email:emails){
            final StringBuilder sb=new StringBuilder();
           
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
            
            final String e=sb.toString();
            if(!s.contains(e)){
                s.add(e);
                c++;  
            }
            
        }
        return c; 
    }
}