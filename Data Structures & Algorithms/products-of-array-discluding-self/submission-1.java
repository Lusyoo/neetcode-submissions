class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] res = new int[n];

        res[0] = 1;
        res[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }

        int post = 1;

        for (int i = n - 2; i > -1; i--) {
            post *= nums[i + 1];

            res[i] *= post;
        }

        return res;

    }
}  
