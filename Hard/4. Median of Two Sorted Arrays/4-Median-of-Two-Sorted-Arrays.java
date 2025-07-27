class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // Eğer biri boşsa, diğerinin medianını dön
        if (m == 0) return findMedianSingleArray(nums2);
        if (n == 0) return findMedianSingleArray(nums1);

        int total = m + n;
        int half = total / 2;

        int nums1L = ((m + 1) / 2) - 1;
        int nums2L = (half - (nums1L + 1)) - 1;

        while (nums1L + 1 < m && nums2L >= 0 && nums2[nums2L] > nums1[nums1L + 1]) {
            nums1L++;
            nums2L--;
        }

        while (nums2L + 1 < n && nums1L >= 0 && nums1[nums1L] > nums2[nums2L + 1]) {
            nums1L--;
            nums2L++;
        }

        int leftMax = Math.max(
                nums1L >= 0 ? nums1[nums1L] : Integer.MIN_VALUE,
                nums2L >= 0 ? nums2[nums2L] : Integer.MIN_VALUE
        );

        int rightMin = Math.min(
                (nums1L + 1 < m) ? nums1[nums1L + 1] : Integer.MAX_VALUE,
                (nums2L + 1 < n) ? nums2[nums2L + 1] : Integer.MAX_VALUE
        );

        if (total % 2 == 1) {
            return rightMin;
        } else {
            return (leftMax + rightMin) / 2.0;
        }
    }

    private double findMedianSingleArray(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0.0;
        if (len % 2 == 1) {
            return nums[len / 2];
        } else {
            return (nums[(len / 2) - 1] + nums[len / 2]) / 2.0;
        }
    }
}
