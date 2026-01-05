# Merge Sorted Array (In-Place)

## Problem
Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

- `nums1` has length `m + n`
- First `m` elements are valid
- Remaining `n` positions are empty
- The merge must be done **in place**

---

## Key Idea
Since both arrays are already sorted and `nums1` has extra space at the end, the merge is performed **from right to left**.  
This avoids overwriting unprocessed elements in `nums1`.

---

## Approach (Optimal)
1. Use three pointers:
   - End of valid elements in `nums1`
   - End of `nums2`
   - Last index of `nums1`
2. Compare the largest remaining elements of both arrays.
3. Place the larger element at the current end position of `nums1`.
4. Move pointers backward accordingly.
5. After comparisons finish, copy any remaining elements from `nums2`.

---

## Why It Works
- Merging from the end prevents data loss.
- Each element is processed exactly once.
- No additional memory is used.

---

## Complexity
- **Time Complexity:** `O(m + n)`
- **Space Complexity:** `O(1)`

---

## Important Note
Only remaining elements of `nums2` need to be copied at the end.  
If `nums1` has remaining elements, they are already in the correct position.

---

## Summary
This solution efficiently merges two sorted arrays in place by leveraging unused space in `nums1` and working backward to preserve order.
