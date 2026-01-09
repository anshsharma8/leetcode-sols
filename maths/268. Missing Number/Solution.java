class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        int x = (a * (a + 1)) / 2;

        int b = 0;
        for (int y : nums) {
            b += y;
        }

        return x - b;
    }
}
