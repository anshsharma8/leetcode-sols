# Max Consecutive Ones

## Problem
Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

## Key Idea
Maintain a running count of consecutive `1`s while traversing the array.  
Reset the count whenever a `0` is encountered and track the maximum count seen so far.

## Approach (Optimal)
1. Initialize two variables:
   - `count1` to track the current streak of consecutive `1`s
   - `count2` to store the maximum streak found
2. Traverse the array:
   - If the current element is `1`, increment `count1`
   - If the current element is `0`, update `count2` with the maximum of `count2` and `count1`, then reset `count1` to `0`
3. After traversal, return the maximum of `count2` and `count1` to handle arrays ending with `1`s.

## Why It Works
- Each element is processed exactly once.
- The running counter keeps track of current consecutive `1`s.
- Updating the maximum on encountering `0` ensures no streak is missed.

## Complexity
- **Time Complexity:** O(n), where n is the length of the array.
- **Space Complexity:** O(1), as only constant extra variables are used.

## Important Note
- Works for all edge cases, including arrays ending with `1`.
- No modification of the input array is required.

## Summary
This solution efficiently finds the longest sequence of consecutive `1`s using a single pass and constant extra space.
