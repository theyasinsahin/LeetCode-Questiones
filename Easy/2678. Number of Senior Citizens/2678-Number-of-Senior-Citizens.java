class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        for (String detail: details) {
            if(Integer.parseInt(detail.substring(11,13)) > 60){
                counter++;
            }
        }
        return counter;
    }
}