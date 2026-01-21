# Find All Numbers Disappeared in an Array

## Problem
Given an array `nums` of length `n` where `1 ≤ nums[i] ≤ n`, some numbers appear once and others appear twice.  
Return all the numbers in the range `[1, n]` that **do not appear** in the array.

## Key Idea
Use the **Index as Hash / Negation Method**.  
Each number maps to an index (`value - 1`).  
By marking visited indices as negative, we can later identify which numbers never appeared.

## Approach (Optimal)
1. Traverse the array.
2. For each element `nums[i]`, calculate its index as `abs(nums[i]) - 1`.
3. Mark the value at that index as **negative** to indicate the number has appeared.
4. Traverse the array again.
5. If an element is **positive**, its index + 1 is a missing number.
6. Collect all such missing numbers in a list.

## Why It Works
- Values lie in the range `1 to n`, so every value maps to a valid index.
- Negating values acts as a visited marker.
- Positive values after marking indicate missing numbers.

## Complexity
- **Time Complexity:** O(n), two linear passes over the array.
- **Space Complexity:** O(1), no extra space used (excluding output list).

## Important Note
- The input array is modified during execution.
- Works only when numbers are within the range `1 to n`.

## Summary
This solution efficiently finds all missing numbers using in-place marking.  
It avoids extra space by leveraging the array itself as a frequency tracker.
