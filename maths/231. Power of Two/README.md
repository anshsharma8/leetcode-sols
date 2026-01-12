Power of Two

Problem Statement  
Given an integer `n`, determine whether it is a power of two.  
A number is a power of two if it can be written as `2^x` for some integer `x`.

Example  
Input: n = 16  
Output: true  

Input: n = 18  
Output: false  

Approach  
First, check whether the number is less than or equal to zero.  
Any number that is zero or negative cannot be a power of two.

Next, use a bitwise property of power-of-two numbers.  
A power of two has exactly one `1` in its binary representation.

When we subtract `1` from such a number, all bits after that single `1` become `1`.  
Performing a bitwise AND between the number and `n - 1` will give `0` only if the number had a single `1`.

If the result of this operation is zero, the number is a power of two.  
Otherwise, it is not.

Time Complexity (TC)  
O(1)  
The check uses constant-time bitwise operations.

Space Complexity (SC)  
O(1)  
No extra memory is used.

Conclusion  
This approach efficiently checks whether a number is a power of two using bit manipulation, without loops or extra space.
