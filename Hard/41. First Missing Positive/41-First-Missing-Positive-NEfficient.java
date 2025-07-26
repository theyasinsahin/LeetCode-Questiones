class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missingPositive = 1;
        for(int i = 0; i<nums.length; i++){
            if(missingPositive == nums[i]) missingPositive++;
        }
        return missingPositive;
    }
}