
Problem Definition

1. You are given an integer array `nums` of length `n`.

2. Each element in the array lies in the range `1` to `n`.

3. Every number appears either once or twice.

4. Exactly one number appears more than once.

5. The task is to find and return the duplicate number.

6. The solution must run in O(n) time.

7. The solution must use constant auxiliary space, excluding the space needed to store the output.



Approach Explanation

1. Traverse the array from left to right.

2. For each element, take its absolute value to get the original number.
   This is necessary because some elements may already be marked negative.

3. Convert the number into an index by subtracting 1.
   A number `k` corresponds to index `k - 1`.

4. Check the value at the calculated index.

   4.1 If the value is already negative, it means this number has been seen before.
       Therefore, this number is the duplicate.

   4.2 If the value is positive, mark it as visited by making it negative.

5. Continue this process until the entire array is traversed.



Why This Works

1. All numbers are guaranteed to be within the range `1` to `n`.

2. This allows each number to map directly to a valid index in the array.

3. Negating the value at an index acts as a visited marker.

4. Using absolute values ensures correct indexing even after modifications.

5. No additional data structures are used.



Time Complexity (TC)

1. The array is traversed only once.

2. Time complexity is O(n).



Space Complexity (SC)

1. No extra memory is used for tracking elements.

2. Only a few variables are required.

3. Auxiliary space complexity is O(1).

4. Space used to store the output is allowed by the problem constraints.



Important Notes

1. This approach modifies the input array.

2. It should be used only when modifying the input is permitted.
