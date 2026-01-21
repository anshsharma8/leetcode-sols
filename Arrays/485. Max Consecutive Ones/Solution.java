class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1 += 1;
            }
            if (nums[i] == 0) {
                count2 = Math.max(count2, count1);
                count1 = 0;
            }
        }

        return Math.max(count2, count1);
    }
}
