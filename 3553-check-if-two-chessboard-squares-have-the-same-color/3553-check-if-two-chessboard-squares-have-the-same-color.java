class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a1=coordinate1.charAt(0);
        int n1=(int)coordinate1.charAt(1);

        char a2=coordinate2.charAt(0);
        int n2=(int)coordinate2.charAt(1);

        String s1,s2;

        if(a1=='a' || a1=='c' || a1=='e' || a1=='g'){
            if(n1%2==0){
                s1="white";
            }
            else{
                s1="black";
            }
        }
        else{
            if(n1%2!=0){
                s1="white";
            }
            else{
                s1="black";
            }
        }

        if(a2=='a' || a2=='c' || a2=='e' || a2=='g'){
            if(n2%2==0){
                s2="white";
            }
            else{
                s2="black";
            }
        }
        else{
            if(n2%2!=0){
                s2="white";
            }
            else{
                s2="black";
            }
        }
        return s1==s2;

        
    }
}