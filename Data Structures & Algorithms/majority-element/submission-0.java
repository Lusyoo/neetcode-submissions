class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            int j = map.compute(i, (k,v) -> v == null ? 1 : v + 1);

            if (j > (nums.length / 2)) return i;
        }
        
        return 0;
    }
}