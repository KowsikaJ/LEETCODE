class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] a=new int[n];
        for(int[] l:shifts){
            int st=l[0];
            int en=l[1];
            int d=l[2];

            if(d==1){
                a[st]+=1;
                if(en+1<n){
                    a[en+1]-=1;
                }
            }
            else{
                a[st]-=1;
                if(en+1<n){
                    a[en+1]+=1;
                }
            }
        }
        for(int i=1;i<n;i++){
            a[i]+=a[i-1];
        }

        char[] cha=s.toCharArray();
        for(int i=0;i<n;i++){
            int shi=(a[i]%26+26)%26;
            int ch=cha[i]-'a';
            ch=(ch+shi)%26;
            cha[i]=(char)('a'+ch);

        }
        return new String(cha);
        
    }
}