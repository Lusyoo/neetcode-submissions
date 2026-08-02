class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String s = strs[0];

        if (strs.length == 1) return s;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return s.substring(0, i);
                }
            }
        }

        return s;

    }
}