Roman to Integer (Java)
This project converts a Roman numeral string into its corresponding integer value using an efficient and clean approach.

Problem Overview
Roman numerals use seven symbols (I, V, X, L, C, D, M).
If a smaller numeral appears before a larger one, it is subtracted instead of added.

Example:
IV → 4
IX → 9

Approach
1.Use a fixed-size HashMap to store Roman numeral values.
2.Traverse the string from right to left.
3.Track the previously processed numeral.
4.Add the current value if it is greater than or equal to the previous value; otherwise, subtract it.
5.This approach correctly handles all subtraction cases.

Example

Input:
LVIII

Output:
58

Complexity Analysis

Time Complexity: O(n) — each character is processed once.

Space Complexity: O(1) — uses a fixed-size lookup table.

Implementation
Language: Java
No additional data structures like stacks are used.
