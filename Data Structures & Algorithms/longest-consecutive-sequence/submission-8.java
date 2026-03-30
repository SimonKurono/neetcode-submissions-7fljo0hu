class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length <= 1) return nums.length;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int n : nums) {
            minheap.offer(n);
        }

        int max = 0;
        int curMax = 1;
        int prev = minheap.poll();

        while(!minheap.isEmpty()) {
            int cur = minheap.poll();

            if (Math.abs(cur - prev) == 1) {
                curMax++;
                if (curMax > max) {
                    max = curMax;
                }
            } else if ((cur-prev) == 0) {
                if (curMax > max) {
                    max = curMax;
                }
            } else {
                curMax = 1;
            }
            prev = cur;
            
        }

        return max;
    }
}
