Remove Duplicates from Sorted Array

Problem:
Remove duplicates from a sorted array in-place and return the number of unique elements.

Approach:
Since the array is sorted, duplicates are adjacent.
Use a counter to track the position of the next unique element.
When a new value is found, overwrite the array at the counter index.
The first count elements of the array contain the unique values.

Complexity:
Time Complexity: O(n)
Space Complexity: O(1)
