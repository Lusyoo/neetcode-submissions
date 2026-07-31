class Solution {
    public boolean isAnagram(String s, String t) {

        int sLength = s.length(), tLength = t.length();

        if (sLength != tLength) return false;

        int[] char1 = new int[156];
        int[] char2 = new int[156];

        for (char c : s.toCharArray()) {
            char1[c]++;
        }

        for (char c : t.toCharArray()) {
            char2[c]++;
        }


        for (int i = 0; i < 156; i++) {
            if (char1[i] != char2[i]) return false;
        }

        return true;
    }
}
