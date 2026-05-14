class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            int[] alphebet = new int[26];
            for(char c : str.toCharArray()){
                alphebet[c - 'a']++;
            }// For loop
            String key = Arrays.toString(alphebet);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);

        }// Outer For loop

        return new ArrayList<>(map.values());

    }
}
