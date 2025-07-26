class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        createCombination(candidates, combination, 0, target, 0);
        return result;
    }

    public void createCombination(int[] candidates, List<Integer> combination, int sum, int target, int startIndex){
        for (int i = startIndex; i < candidates.length; i++) {
            combination.add(candidates[i]);
            sum += candidates[i];

            if (sum < target) createCombination(candidates, combination, sum, target, i);
            else if (sum == target) result.add(new ArrayList<>(combination));

            // backtrack
            sum -= candidates[i];
            combination.remove(combination.size() - 1);
        }
    }
}