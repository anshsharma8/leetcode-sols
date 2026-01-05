class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = m - 1;
        int b = n - 1;
        int i = nums1.length - 1;
        while (i >= 0 && a >= 0 && b >= 0) {
            if (nums2[b] > nums1[a]) {
                nums1[i] = nums2[b];
                b--;
            }

            else {
                nums1[i] = nums1[a];
                nums1[a] = nums2[b];
                a--;

            }

            i--;

        }
        while (b >= 0) {
            nums1[i] = nums2[b];
            b--;
            i--;
        }
    }
}
