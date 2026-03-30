class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        boolean containsZero = false;
        int ZeroCount = 0;
        for (int i : nums) {
            if (i != 0) {
                total*=i;
            } else {
                containsZero = true;
                zeroCount++;
            }
        }

        if (zeroCount == nums.length) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (containsZero) {
                    nums[i] = 0;
                } else{
                    nums[i] = total/nums[i];
                }
            } else {
                nums[i] = total;
            } 
        }

        return nums;
    }
}  
