Problem
Given a string `s` and an integer `k`, return the maximum number of vowel letters in any substring of length `k`.

Vowels are: `a`, `e`, `i`, `o`, `u`.

## Key Idea
Use the **Sliding Window Technique** to maintain the count of vowels inside a window of size `k` while moving through the string.

## Approach (Optimal)
1. Store all vowels in a HashSet for quick lookup.
2. Count vowels in the first `k` characters.
3. Initialize the result with this count.
4. Slide the window:
   - If the new character entering the window is a vowel, increment count.
   - If the character leaving the window is a vowel, decrement count.
5. Update the maximum vowel count after each slide.
6. Return the maximum value found.

## Why It Works
- Sliding window avoids recomputing vowel counts for each substring.
- HashSet allows constant-time vowel checking.
- Each character is processed only once.

## Complexity
- **Time Complexity:** O(n), where n is the length of the string.
- **Space Complexity:** O(1), since the vowel set size is constant.

## Important Note
- Works for lowercase English letters.
- Input string is not modified.

## Summary
This solution efficiently finds the maximum number of vowels in any substring of length `k` using a sliding window and constant extra space.
