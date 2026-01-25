class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        res = sum;

        if (sum / k >= threshold) {
            count = 1;
        }
        for (int i = k; i < arr.length; i++) {
            res = res + arr[i] - arr[i - k];

            if (res / k >= threshold) {
                count++;
            }
        }
        return count;

    }
}
