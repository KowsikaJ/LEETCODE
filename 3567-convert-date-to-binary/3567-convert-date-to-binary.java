class Solution {
    String st="";
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String y=date.substring(0,4);
        String m=date.substring(5,7);
        String d=date.substring(8);

        sb.append(convertbinary(y)).append("-"); 
        sb.append(convertbinary(m)).append("-"); 
        sb.append(convertbinary(d));   
        return sb.toString();
    }
   
    public String convertbinary(String dat){
       int i=0;
       int daa = Integer.parseInt(dat);
       StringBuilder sbb=new StringBuilder();

        while(daa>0){
            int r=daa%2;
            sbb.append(r);
            daa/=2;
        }
        return sbb.reverse().toString();
        
    }
}