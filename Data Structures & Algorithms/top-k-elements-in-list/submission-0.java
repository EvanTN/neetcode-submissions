class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> most_frequent = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            most_frequent.add(new int[] {entry.getValue(), entry.getKey()});
        }// For Loop
        most_frequent.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = most_frequent.get(i)[1];
        }

        return res;
    }
}
