class Solution {
    public boolean isPalindrome(String s) {
        
        
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
        

        int left = 0;
        int right = s.length()-1;

        while (left <= right) {
            if (s.ignoreCase().charAt(left) != s.ignoreCase().charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    
}
