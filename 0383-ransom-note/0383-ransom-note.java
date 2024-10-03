class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        char[] c1 = ransomNote.toCharArray();
        char[] c2 = magazine.toCharArray();
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            arr[c2[i] - 'a']++;
        }

        for (int i = 0; i < m; i++) {
            arr[c1[i] - 'a']--;
            if (arr[c1[i] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
