class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return List.of(List.of(""));

        if (strs.length == 1) return List.of(List.of(strs[0]));

        Map <String, List <String>> map = new HashMap<>();

        for (String s : strs) {

            char[] c = s.toCharArray();

            Arrays.sort(c);

            String word = new String(c);

            map.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
