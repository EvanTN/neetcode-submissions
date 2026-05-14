class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,  map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        } // for loop

        for(char c: t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c, map.get(c)-1);
            if(map.get(c) == 0)
                map.remove(c);
        } // for loop
        
        return map.isEmpty();

    }
}
