class Solution {
    public int majorityElement(int[] nums) {
        int betNumber = 0;
        int count = 0;

        for (int i : nums) {
            if (count == 0) betNumber = i;

            if (i == betNumber) count++;
            else count--;
        }

        return betNumber;
    }
}