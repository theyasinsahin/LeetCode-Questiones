class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        int midTarget = -1;
        int firstTarget = -1;
        int lastTarget = -1;

        while(end >= start){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                midTarget = mid;
                break;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        if (midTarget == -1) {
            return new int[]{-1, -1};
        }

        start = 0;
        end = midTarget;
        while(end >= start){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                firstTarget = mid;
                end = mid - 1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }

        start = midTarget;
        end = nums.length -1;
        while(end >= start){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                lastTarget = mid;
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        int[] result = {firstTarget, lastTarget};
        return result;
    }
}