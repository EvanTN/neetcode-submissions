class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] postfix = new int[size];
        int[] res = new int[size];

        prefix[0] = 1;
        postfix[size - 1] = 1;
        for(int i = 1; i < size; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        for(int i = size - 2; i >= 0; i--){
            postfix[i] = nums[i+1] * postfix[i+1];               
        }


        for(int i = 0; i < size; i++){
            res[i] = prefix[i] * postfix[i];
        }

        return res;
    }
}  
