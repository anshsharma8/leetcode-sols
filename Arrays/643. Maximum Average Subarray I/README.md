# Maximum Average Subarray I

## Problem
Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the **maximum average value**, and return this average.

## Key Idea
Use the **Sliding Window Technique** to maintain the sum of a subarray of size `k` while moving through the array.

## Approach (Optimal)
1. Calculate the sum of the first `k` elements and store it.
2. Treat this as the initial window sum.
3. Slide the window by:
   - Adding the next element.
   - Subtracting the element leaving the window.
4. Track the maximum window sum during traversal.
5. Divide the maximum sum by `k` to get the maximum average.

## Why It Works
- Sliding window avoids recomputing sums for every subarray.
- Each element is added and removed exactly once.
- Efficient for large arrays.

## Complexity
- **Time Complexity:** O(n), where n is the length of the array.
- **Space Complexity:** O(1), constant extra space.

## Important Note
- Uses `double` to preserve decimal precision.
- Input array is not modified.

## Summary
This solution efficiently finds the maximum average of any subarray of size `k` using the sliding window technique and constant extra space.
