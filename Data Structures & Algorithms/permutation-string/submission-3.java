class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();


        for (int i = 0; i < n2; i++) {

            if (i + n1 - 1 < n2) {
                char[] c1 = s1.toCharArray();
                char[] c2 = s2.substring(i, i + n1).toCharArray();

                Arrays.sort(c1);
                Arrays.sort(c2);

                if (new String(c1).equals(new String(c2))) return true;
            }
        }

        return false;
    }
}
