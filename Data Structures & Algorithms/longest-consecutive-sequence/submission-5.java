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
        System.out.println(prev);

        while(!minheap.isEmpty()) {
            int cur = minheap.poll();
            System.out.println(cur);

            if (Math.abs(cur - prev) == 1) {
                curMax++;
                if (curMax > max) {
                    max = curMax;
                }
            } else if ((cur-prev) == 0) {
                curMax = curMax;
            } else {
                curMax = 0;
            }
            prev = cur;
            
        }

        return max;
    }
}
