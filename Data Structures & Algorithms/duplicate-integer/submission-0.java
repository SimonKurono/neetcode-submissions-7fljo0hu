class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> pairs = new HashMap<>();

        for(int i : nums){
            if(pairs.get(i) == 1){
                return true;
            }
            pairs.put(i,1);
        }
        return false;
    }
}
