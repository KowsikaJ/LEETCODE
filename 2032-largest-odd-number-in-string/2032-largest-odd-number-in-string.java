class Solution {
    public String largestOddNumber(String num) {
        // Iterate from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            // Check if the current character is an odd digit
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1); // Return the substring
            }
        }
        return ""; // Return empty string if no odd digit is found
    }
}
