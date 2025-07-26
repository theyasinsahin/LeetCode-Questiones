class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        createCombination(candidates, combination, 0, target, 0);
        return result;
    }

    public void createCombination(int[] candidates, List<Integer> combination, int sum, int target, int startIndex){
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i - 1]) continue;

            combination.add(candidates[i]);
            sum += candidates[i];

            if (sum < target) createCombination(candidates, combination, sum, target, i+1);
            else if (sum == target)result.add(new ArrayList<>(combination));

            // backtrack
            sum -= candidates[i];
            combination.remove(combination.size() - 1);
        }
    }
}