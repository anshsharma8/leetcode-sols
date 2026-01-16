# Reverse String (In-Place)

## Problem
Given an array of characters `s`, reverse the array **in-place**.

**Example 1:**  
Input: `s = ["h","e","l","l","o"]`  
Output: `["o","l","l","e","h"]`

**Example 2:**  
Input: `s = ["H","a","n","n","a","h"]`  
Output: `["h","a","n","n","a","H"]`

## Key Idea
Swap characters from both ends of the array, moving towards the center.  
This allows the string to be reversed **in-place** without using extra memory.

## Approach (Optimal)
1. Initialize two pointers:  
   - `i` at the start of the array  
   - `j` at the end of the array  
2. Swap the characters at `i` and `j`.  
3. Move `i` forward and `j` backward.  
4. Repeat until `i >= j`.  

## Why It Works
- Each character is moved exactly once.  
- Reversing from both ends ensures correctness for any array length.  
- No additional memory is needed because the operation is in-place.

## Complexity
- **Time Complexity:** O(n), where n is the length of the array.  
- **Space Complexity:** O(1), since no extra memory is used.

## Important Note
- Works for both odd and even length arrays.  
- The input array `s` is modified directly; no new array is created.

## Summary
This solution efficiently reverses a string in-place using the two-pointer approach, processing each element exactly once and using constant extra space.



