Missing Number (Java)

Problem Statement  
Given an array `nums` containing `n` distinct numbers taken from the range `[0, n]`, find and return the single number that is missing from the array.

Example  
Input: nums = [3, 0, 1]  
Output: 2  

Approach  
This problem is solved using a mathematical approach based on the sum of natural numbers.

First, calculate the expected sum of all numbers from `0` to `n` using the formula `n * (n + 1) / 2`, where `n` is the length of the array.  
Then, calculate the actual sum of all elements present in the array by iterating through it.  
The difference between the expected sum and the actual sum gives the missing number.

Time Complexity (TC)  
O(n)  
The array is traversed once to calculate the actual sum of elements.

Space Complexity (SC)  
O(1)  
Only a constant amount of extra space is used.

Conclusion  
This approach efficiently finds the missing number using basic mathematics with linear time complexity and constant space complexity.
