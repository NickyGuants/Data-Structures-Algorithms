# Arrays

## What are Arrays?

Array is a data structure that stores a collection of common items in contiguous/consequtive memory locations. They are also referred to as sequences. 
Arrays and strings are quite similar and questions on arrays can also be presented as string problems.

## Strengths of arrays

- They are efficient in storing a list of items to be accessed using their indexes.
- The lookup has constant time complexity O(1) since the indexes of the array elements are known beforehand.

## Limitations:

- Java arrays are static meaning the size/capacity is fixed to the capacity declared at initialization. This means when the array is full, 
you have to manually create another array and copy the existing elements to the new array with a larger capacity. Time complexity is O(n).
- To remove an element from an array you have to shift elements to fill the gap left. Time complexity is O(n).

### We assume we are working with a dynamic array

## Common Array Operations and their Time complexities.


## Implementation of the Array Operations

### Insertion

This refers to adding a new element to the array. There are two variations of this operation:
1. ##### Insert at the end of the array
    Here, we are inserting the new element at the end of the array.
    
    #### Steps:
    
    - Check if the array is full.
    - If it is full, 
        - create a new array and copy all the elements of the old array to the new array O(n)
        - Add the new element at the end of the new array.
        - Increment count(number of items in the array)
        
    - If the array is not full,
        - Add the element at the end the array
        - Increment count(number of items in the array)
        
2. ##### Insert at the beginning or anywhere in the middle
    Here, we are inserting the new element at any other index other than the last index given the value to insert and the index where to insert.
    
    #### Steps
        
    - if arrays is full:
        - Create a new array with ouble the size of original array.
        - Copy all elements to the new array
        
    - If array is not full:
    
    - Shift elements to the right beginning from the end of the array upto the index to be inserted at.
  
          for(int i=count; i>index; i--){
          items[i]=items[i-1];
          }
        
    - Insert element at the given index and increment count.
    
          items[index]=value;
          count++;
    
