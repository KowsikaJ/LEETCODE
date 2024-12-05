class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previous = countAndSay(n - 1);
        StringBuilder current = new StringBuilder();
        
        int count = 0;
        char digit = previous.charAt(0);
        
        for (int i = 0; i < previous.length(); i++) {
            if (previous.charAt(i) == digit) {
                count++;
            } else {
                current.append(count).append(digit);
                digit = previous.charAt(i);
                count = 1;
            }
        }
        current.append(count).append(digit);
        
        return current.toString();
    }
}
