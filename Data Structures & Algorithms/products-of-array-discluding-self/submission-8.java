class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int pre = 1;
        
        //[1,2,4,6]
        //[1,1,2,8]
        
        for (int i = 0; i < n; i++) {
            res[i]=pre;
            pre*=nums[i];
        }
        int post = 1;
       
        for (int j = n-1; j >=0; j--) {
            System.out.println(j);
            res[j]=res[j]*post;
            post*=nums[j];
        }

        return res;
    }
}  
