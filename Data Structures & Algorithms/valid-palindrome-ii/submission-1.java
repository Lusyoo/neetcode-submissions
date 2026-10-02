class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char sa = s.charAt(i), sb = s.charAt(j);

            if (sa != sb) {

                String l = s.substring(i, j);
                String r = s.substring(i + 1, j + 1);


                return (l.equals(reverse(l)) || r.equals(reverse(r)));
            }

            i++; j--;
        }

        return true;

    }

    String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}