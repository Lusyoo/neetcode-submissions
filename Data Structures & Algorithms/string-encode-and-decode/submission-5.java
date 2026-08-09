class Solution {

    public String encode(List<String> strs) {

        StringBuilder s = new StringBuilder();

        for (String word : strs) {
            s.append(word.length());
            s.append("-");
            s.append(word);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        List <String> list = new ArrayList<>();

        int n = str.length();

        int i = 0;

        while (i < n) {
            int j = i;

            if (Character.isDigit(str.charAt(i))) {
                while (str.charAt(j) != '-') {
                    j++;
                }
            }

            int wordLength = Integer.parseInt(str.substring(i, j));

            list.add(str.substring(j + 1, j + wordLength + 1));

            i = j + 1 + wordLength;
        }

        return list;
    }

}
