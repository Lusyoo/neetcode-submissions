class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                int index = n - 1;

                for (int j = i + 1; j < n; j++) {
                    if (nums[j] != val) {
                        index = j;
                        break;
                    }
                }

                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        for (int i : nums) {
            if (i != val) count++;
            System.out.print(i);
        }

        System.out.println();

        return count;

    }
}