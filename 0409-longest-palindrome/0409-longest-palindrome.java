class Solution {
    public int longestPalindrome(String s) {
        /*
        HashSet<Character> set=new HashSet<>();
        int l=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                l+=2;
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            l+=1;
        }
        return l;
        */
        int[] arr=new int[52];
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                arr[c-'A']++;
            }
            else{
                arr[c-'a'+26]++;
            }
        }
        int c=0,o=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                c+=arr[i];
            }
            else if(arr[i]%2!=0 && arr[i]!=1){
                c+=arr[i]-1;
                o=1;

            }
            else if(arr[i]==1){
                o=1;
            }
            
        }
        return c+o;
        
    }
}