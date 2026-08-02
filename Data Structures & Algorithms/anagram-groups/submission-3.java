class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return List.of(List.of(""));

        if (strs.length == 1) return List.of(List.of(strs[0]));

        Map <String, List <String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String sumOfStringChars = numOfChar(strs[i]);


            map.compute(sumOfStringChars, (k, v) -> v == null ? new ArrayList<String>() : v).add(strs[i]);   
        }

        return new ArrayList<List<String>>(map.values());

    }

    private String numOfChar(String s) {
      int[] arr = new int[26];

      for (char c : s.toCharArray()) {
        arr[c - 'a']++;
      }


      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < 26; i++) {
        if (arr[i] == 0) continue;

        sb.append((char) (i + 'a'));
        sb.append(arr[i]);
      }

      return sb.toString();
    }
}
