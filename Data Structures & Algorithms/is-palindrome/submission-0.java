class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.trim();
        s = s.toLowerCase();
        int left = 0;
        int right = s.length();

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
