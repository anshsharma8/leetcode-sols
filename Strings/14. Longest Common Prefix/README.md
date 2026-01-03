# Longest Common Prefix (Java)

## Problem Statement
Given an array of strings, find the **longest common prefix** shared by all strings.  
If there is no common prefix, return an empty string `""`.

---

## Approach Used

### Sorting + Prefix Comparison
1. **Handle edge case**  
   - If the array is empty, return `""`.

2. **Sort the array of strings**  
   - After sorting lexicographically:
     - The **first string** is the smallest.
     - The **last string** is the largest.
   - The longest common prefix of the entire array must be the common prefix of these two strings.

3. **Character-by-character comparison**
   - Compare characters of the first and last strings from index `0`.
   - Stop when:
     - Characters mismatch, or
     - End of one string is reached.

4. **Efficient string construction**
   - Use `StringBuilder` to append characters efficiently.
   - Convert it to `String` at the end using `toString()`.

---

## Why `StringBuilder`?
- `String` is **immutable** → repeated concatenation leads to **O(m²)** time.
- `StringBuilder` is **mutable** → appending characters is **O(1) amortized**.
- This makes prefix construction **O(m)** instead of **O(m²)**.

---

## Time Complexity

Let:
- `n` = number of strings  
- `m` = average length of strings  

### Sorting
- `Arrays.sort()` → **O(n log n · m)** (string comparison costs `O(m)`)

### Prefix Comparison Loop
- At most `m` iterations → **O(m)**

### Total Time Complexity
O(n log n · m)
