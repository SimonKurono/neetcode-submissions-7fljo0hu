class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freqs.put(nums[i], freqs.getOrDefault(nums[i],0)+1);
            
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);

        for (int key : freqs.keySet()) {
            pq.offer(new int [] {key, freqs.get(key)});
        }

        int [] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
    }
}
