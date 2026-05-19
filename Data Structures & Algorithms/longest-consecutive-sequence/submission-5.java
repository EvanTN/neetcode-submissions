class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int num : nums){
            System.out.print(num + " ");
        }
        for(int i = 0; i < nums.length-1; i++){
            int diff = nums[i+1] - nums[i];
            if(diff == 1){
                count++;
                max = Math.max(count, max);
            } else if(diff == 0){
                continue;
            }else{
                max = Math.max(count, max);
                count = 1;
            }

        }
        return max;
    }
}
