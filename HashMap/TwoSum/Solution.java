import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

        int x = 0;
        int arr[] = new int[2];

        for (int i = 0; i < nums.length; i++) {

            x = target - nums[i];
            arr[0] = i;
            if (a.containsKey(x)) {
                arr[1] = a.get(x);
                break;
            }

            a.put(nums[i], i);
        }
        return arr;
    }
}
