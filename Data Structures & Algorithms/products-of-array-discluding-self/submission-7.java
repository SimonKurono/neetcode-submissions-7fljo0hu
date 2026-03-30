class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 2) {
            return (nums[0] == 0 && nums[1] == 0) ? nums : new int [] {nums[1],nums[0]};
        }

        int zeroCount = 0;
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                total*=nums[i];
            }
        }

        if (zeroCount >= 2) {
            int [] arr = new int[nums.length];
            return arr;
        }

        if (zeroCount == 1) {
            for (int n = 0; n < nums.length; n++) {
                if(nums[n] == 0) {
                    nums[n] = total;
                } else {
                    nums[n] = 0;
                }
            }  
            return nums; 
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = total/nums[j];
        }
        return nums;
    }
}  
