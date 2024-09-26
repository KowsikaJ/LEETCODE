class Solution {
    public int thirdMax(int[] nums) {
        
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        List<Integer> l=new ArrayList<>(s);
        Collections.sort(l);
        int n=l.size();
        if(n<3){
            return l.get(n-1);
        }
        
        return l.get(n-3);
    }
}
        
        /*
        Integer m1=null;
        Integer m2=null;
        Integer m3=null;
        for(Integer num:nums){
           if(num.equals(m1) || num.equals(m2) ||  num.equals(m3)) {
                continue;
            }
            if(m1==null || num>m1 ){
                m3=m2;
                m2=m1;
                m1=num;
            }
            else if(m2==null || num>m2){
                m3=m2;
                m2=num;
            }
            else if(m3==null || num>m3 ){
                m3=num;
            }
        }
        return m3==null?m1:m3;
        */

  