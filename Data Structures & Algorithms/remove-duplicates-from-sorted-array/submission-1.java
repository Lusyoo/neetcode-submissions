class Solution {
    public int removeDuplicates(int[] nums) {
        
        int prevNum = -101;

        int i = 0, j = 0;

        while (j < nums.length) {
            int num = nums[j];

            if (num != prevNum) {
                nums[i] = num;
                i++;
                prevNum = num;
            }

            j++;
        }

        return i;
    }
}