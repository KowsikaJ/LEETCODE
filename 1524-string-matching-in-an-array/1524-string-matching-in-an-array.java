class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> l=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((!words[i].equals(words[j])) && words[i].contains(words[j])){
                    if(!l.contains(words[j])){
                        l.add(words[j]);
                    }

                }
            }
        }
        return l;
        
    }
}