class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int n : nums) {
            if (mp.containsKey(n)) return true;

            mp.put(n, 1);
        }

        return false;
    }
}