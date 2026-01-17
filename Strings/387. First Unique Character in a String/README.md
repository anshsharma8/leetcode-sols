# First Unique Character in a String

## Problem
Given a string `s` consisting of lowercase English letters, return the **index of the first non-repeating character** in the string.  
If no such character exists, return `-1`.

**Example 1:**  
Input: `s = "leetcode"`  
Output: `0`

**Example 2:**  
Input: `s = "loveleetcode"`  
Output: `2`

**Example 3:**  
Input: `s = "aabb"`  
Output: `-1`

## Key Idea
Use a frequency array to count how many times each character appears.  
Then scan the string again to find the first character whose frequency is `1`.

## Approach (Optimal)
1. Create an integer array of size `26` to store frequencies of lowercase letters.
2. Traverse the string and increment the count for each character.
3. Traverse the string again from left to right.
4. Return the index of the first character whose frequency is `1`.
5. If no such character is found, return `-1`.

## Why It Works
- The frequency array allows constant-time access for each character.
- The second pass preserves the original order of characters.
- Each character is processed only twice.

## Complexity
- **Time Complexity:** O(n), where n is the length of the string.
- **Space Complexity:** O(1), since the array size is fixed (26 characters).

## Important Note
- This solution assumes the string contains only lowercase English letters (`a` to `z`).
- If uppercase or Unicode characters are allowed, a different data structure would be needed.

## Summary
This solution efficiently finds the first unique character by combining frequency counting with a second traversal, ensuring linear time complexity and constant extra space.
