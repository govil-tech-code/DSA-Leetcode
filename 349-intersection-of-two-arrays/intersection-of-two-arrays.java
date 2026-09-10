class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            for (int j = 0; j < k; j++) {
                if (ans[j] == nums1[i]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans[k] = nums1[i];
                k++;
            }
        }
       return java.util.Arrays.copyOf(ans, k);
    }
}