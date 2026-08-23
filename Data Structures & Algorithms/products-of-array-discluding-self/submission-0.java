class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] output = new int[n];

        List <Integer> list = new ArrayList<>();

        int prod = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                list.add(i);
                continue;
            }

            prod *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            
            if (list.size() >= 2) {
                output[i] = 0;
            } else if (list.size() == 1) {
                if (list.get(0) == i) {
                    output[i] = prod;
                } else {
                    output[i] = 0;
                }
            } else {
                output[i] = prod/nums[i];
            }
        }

        return output;

    }
}  
