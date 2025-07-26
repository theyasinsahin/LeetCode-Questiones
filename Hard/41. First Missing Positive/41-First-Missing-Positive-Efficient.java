class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 1. Negatifleri ve 0'ları yok et
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = n + 1;
        }

        // 2. Mevcut sayılar için işaretleme yap
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // 3. İlk pozitif olmayan indeksi bul
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return i + 1;
        }

        return n + 1;
    }
}
