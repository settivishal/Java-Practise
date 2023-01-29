//!Question:
/**Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
**/

//! Solution:
let nums = [4,1,2,1,2];
// SOLUTION 1

    let res = 0, i, n = nums.length;
    for (i = 0; i < n; i++)
        res ^= nums[i];
    console.log(res); 

// SOLUTION 2

    let num = nums.reduce((prev, curr) => prev^curr)
    console.log(num);