class Solution {
    public List<String> summaryRanges(int[] nums) {
        int numsLen = nums.length;
        List<String> result = new ArrayList<>();

        int counter = 0;
        if(numsLen > 1){
            for (int i = 0; i < numsLen-1; i++) {
                if(nums[i]+1 == nums[i+1]){
                    counter++;
                }else{
                    if(counter == 0){
                        result.add(String.valueOf(nums[i]));
                    }else{
                        result.add(nums[i-counter]+ "->"+nums[i]);
                        counter = 0;
                    }
                }

                if(i == numsLen-2){
                    if(counter != 0){
                        result.add(nums[i+1-counter]+ "->"+nums[i+1]);
                    }else{
                        result.add(String.valueOf(nums[i+1]));
                    }
                }
            }
        }else if(numsLen == 1){
            result.add(String.valueOf(nums[0]));
        }

        return result;
    }
}