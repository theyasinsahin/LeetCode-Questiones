class Solution {
    public int findDuplicate(int[] nums) {
        int fastPointer = 0;
        int slowPointer = 0;

        do{
            fastPointer = nums[nums[fastPointer]];
            slowPointer = nums[slowPointer];
        }while(fastPointer != slowPointer);

        fastPointer = 0;
        while(fastPointer != slowPointer){
            fastPointer = nums[fastPointer];
            slowPointer = nums[slowPointer];
        }
        return slowPointer;
    }
}
