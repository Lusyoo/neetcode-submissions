class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();

        s = s.toLowerCase().replace(" ", "");

        char[] temp = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : temp) {
            if (Character.isLetterOrDigit(c)) sb.append(c);
        }

        s = sb.toString();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }
}
