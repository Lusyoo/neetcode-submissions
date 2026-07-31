class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;


        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            char sc = s.charAt(i), tc = t.charAt(i);

            arr[sc - 'a']++;
            arr[tc - 'a']--;
        }

        for (int i : arr)
        {
            if (i != 0) return false;
        }

        return true;
    }
}
