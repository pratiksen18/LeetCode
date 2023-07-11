class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;
        int totalLength = words[0].length() * words.length;
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> tempMap = new HashMap<>(wordCountMap);
            int j = i;
            while (j < i + totalLength) {
                String substring = s.substring(j, j + words[0].length());
                if (!tempMap.containsKey(substring) || tempMap.get(substring) == 0) break;
                tempMap.put(substring, tempMap.get(substring) - 1);
                j += words[0].length();
            }
            if (j == i + totalLength) result.add(i);
        }
        return result;
    }
}