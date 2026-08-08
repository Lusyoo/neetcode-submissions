class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map <Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.compute(i, (key,v) -> v == null ? 1 : v + 1);
        }

        List <Integer> list = map.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue() - e1.getValue())
            .limit(k)
            .map(Map.Entry :: getKey)
            .toList();
        

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
