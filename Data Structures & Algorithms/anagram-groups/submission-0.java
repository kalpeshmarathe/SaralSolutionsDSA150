class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> anagram = new HashMap<>();

        for(String word : strs)
        {
            char words[] = word.toCharArray();
            Arrays.sort(words);
            String sortedwords = new String(words);

            if(!anagram.containsKey(sortedwords))
            {
                anagram.put(sortedwords,new ArrayList<>());
            } 
            anagram.get(sortedwords).add(word);
        }
        return new ArrayList<>(anagram.values());
    }
}
