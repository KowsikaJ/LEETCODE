class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> fromto=new HashMap<>();
        HashMap<String,String> tofrom=new HashMap<>();

        for(int i=0;i<paths.size();i++){
            fromto.put(paths.get(i).get(0),paths.get(i).get(1));
            tofrom.put(paths.get(i).get(1),paths.get(i).get(0));
        }
        for(int i=0;i<paths.size();i++){
            for(String dest:tofrom.keySet()){
                if(!fromto.containsKey(dest)){
                    return dest;

                }
            }
        }
        return null;
    }  
     
}