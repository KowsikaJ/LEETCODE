class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;

        for(char[] r:box){
            int dropbox=n-1;

            for(int i=n-1;i>=0;i--){
                if(r[i]=='*'){
                    dropbox=i-1;
                }
                else if(r[i]=='#'){
                    char temp=r[dropbox];
                    r[dropbox]=r[i];
                    r[i]=temp;
                    dropbox--;
                }
            }
        }
        char[][] rot=new char[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rot[j][m-1-i]=box[i][j];
            }

        }
        return rot;
        
    }
}