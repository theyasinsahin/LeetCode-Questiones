class Solution {
    public int[][] merge(int[][] intervals) {
        int intervalsLen = intervals.length;
        int[][] resultIntervals = new int[intervalsLen][2];
        int counter = 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        if(intervalsLen>0){
            resultIntervals[counter] = intervals[0];
        }
        for (int i = 1; i < intervalsLen; i++) {

            if(resultIntervals[counter][1] >= intervals[i][0]){
                if(!(resultIntervals[counter][1] >= intervals[i][1])){
                    resultIntervals[counter][1] = intervals[i][1];
                }
            }else{
                counter++;
                resultIntervals[counter] = intervals[i];
            }
        }

        return Arrays.copyOf(resultIntervals, counter + 1);

    }
}