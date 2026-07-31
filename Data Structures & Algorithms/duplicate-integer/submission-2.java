class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.compute(i, (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i : map.values()) {
            if (i > 1) return true;
        }

        return false;
    }
}