class Solution {
    public boolean isPalindrome(String s) {
        String newst=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return newst.equals(new StringBuilder(newst).reverse().toString());
        
    }
}