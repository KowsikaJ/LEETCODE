class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int s;
        List<String> res=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    s=i+j;
                    if(s<min){
                        res.clear();
                        res.add(list1[i]);
                        min=s;
                    }
                    else if(s==min){
                        res.add(list1[i]);
                    }
                }
            }
        }
        return res.toArray(new String[0]);
        
    }
}

