class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLen = nums.length;
        int[] answer = new int[numsLen];
        int[] left = new int[numsLen];
        int[] right = new int[numsLen];

        int rightResult = 1;
        int leftResult = 1;

        for (int i = 0; i < numsLen; i++) {
            left[i] = leftResult;
            leftResult *= nums[i];

            int j = numsLen-1-i;
            right[j] = rightResult;
            rightResult *= nums[j];
        }

        for (int i = 0; i < numsLen; i++) {
            answer[i] = left[i]*right[i];
        }

        return answer;
    }
}