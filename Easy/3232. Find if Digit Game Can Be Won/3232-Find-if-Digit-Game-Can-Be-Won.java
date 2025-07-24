class Solution {
    public boolean canAliceWin(int[] nums) {
        int result = 0;
        for (int num: nums) {
            if(num<10){
                result += num;
            }else{
                result -= num;
            }
        }
        return result != 0;
    }
}