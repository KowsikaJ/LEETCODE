class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length,len=queries.length;
        int[] vowelcount=new int[n];
        int[] res=new int[len];
        int c=0;
        for(int i=0;i<n;i++){
            if(isvowel(words[i].charAt(0)) && isvowel(words[i].charAt(words[i].length()-1))){
                c++;
            }
            vowelcount[i]=c;
        }
        for(int i=0;i<len;i++){
            int count=vowelcount[queries[i][1]];
            if(queries[i][0]-1>=0) count-=vowelcount[queries[i][0]-1];
            if(count>0) res[i]=count;
        }
        return res;
    }
    public boolean isvowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
          
    }  

        /*int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int en=queries[i][1];
            int c=0;
            for(int j=st;j<=en;j++){
                char fi=words[j].charAt(0);
                char la=words[j].charAt(words[j].length()-1);

                if(isvowel(fi) && isvowel(la)){
                    c++;
                }
            }
            ans[i]=c;
            c=0;

        }
        return ans;  
       
    }
    
    public boolean isvowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
          
    }    
    TIME LIMIT EXCEEDED(93/94--> TESTCASES PASSED)
    
    */
    



}
