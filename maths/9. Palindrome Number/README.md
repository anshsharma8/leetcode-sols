Palindrome Number Checker (Java)

Problem Statement
Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

A number is a palindrome if it reads the same from **left to right** and **right to left**.

 Examples
- Input: `121` → Output: `true`
- Input: `-121` → Output: `false`

---

Approach Used

This solution uses a **string-based two-pointer approach**.

Step-by-step Explanation:

1. Convert the integer `x` into a string using `StringBuilder`.
2. Use two pointers:
   - `i` starting from the **beginning** of the string
   - `j` starting from the **end** of the string
3. Compare characters at positions `i` and `j`.
4. If at any point the characters do not match, return `false`.
5. Move the pointers inward (`i++`, `j--`) and continue.
6. If all characters match, return `true`.

Time Complexity (TC)
O(n)
Where n is the number of digits in the integer.
Each digit is compared at most once.

Space Complexity (SC)
O(n)
Extra space is used to store the string representation of the number.
