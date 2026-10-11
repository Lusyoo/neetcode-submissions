class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n = word1.length(), n2 = word2.length();

        if (n2 == 0) return word1;

        int i = 0, j = 0;

        StringBuilder sb = new StringBuilder();


        while (i < n && j < n2) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        System.out.println(i + " " + j);

        if (i != n) sb.append(word1.substring(i));
        if (j != n2) sb.append(word2.substring(j));
        

        return sb.toString();
    }
}