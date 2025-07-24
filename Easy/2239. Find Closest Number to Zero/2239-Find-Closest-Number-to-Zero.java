class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNumber = Integer.MAX_VALUE;
        for (int num:
                nums) {
            if(Math.abs(num)<Math.abs(closestNumber)){
                closestNumber=num;
            }
        }

        if(closestNumber < 0){
            for (int num:
                    nums) {
                if(Math.abs(closestNumber)==num){
                    closestNumber=num;
                }
            }
        }
        return closestNumber;
    }
}