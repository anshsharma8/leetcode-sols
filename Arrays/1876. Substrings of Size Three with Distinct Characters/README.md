Count Good Substrings

## Problem
Given a string `s`, return the number of substrings of length `3` that consist of **distinct characters**.

## Key Idea
Use a **Sliding Window of fixed size 3** and directly compare the three characters to check if all are different.

## Approach (Optimal)
1. If the string length is less than `3`, return `0`.
2. Traverse the string starting from index `2`.
3. For each position `i`, consider the substring:
   - `s[i-2]`, `s[i-1]`, `s[i]`
4. Check if all three characters are different:
   - `s[i] != s[i-1]`
   - `s[i] != s[i-2]`
   - `s[i-1] != s[i-2]`
5. If true, increment the count.
6. Return the final count.

## Why It Works
- Every substring of size `3` is checked exactly once.
- Direct character comparisons avoid extra data structures.
- Efficient and simple.

## Complexity
- **Time Complexity:** O(n), where n is the length of the string.
- **Space Complexity:** O(1), constant extra space.

## Important Note
- Works for lowercase and uppercase characters.
- Input string is not modified.

## Summary
This solution efficiently counts substrings of length 3 with all distinct characters using a fixed-size sliding window and constant space.
