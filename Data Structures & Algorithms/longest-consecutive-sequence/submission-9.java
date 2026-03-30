class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length <= 1) return nums.length;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int maxStreak = 0;
        

        for (int s : set) {
            if (!set.contains(s-1)) { // checking for min element first
                int curStreak = 1;
                int cur = s;

                while(set.contains(cur+1)) {
                    curStreak++;
                    cur++;
                }
                maxStreak = Math.max(curStreak, maxStreak);
            }

            
        }

        return maxStreak;

        
    }
}
