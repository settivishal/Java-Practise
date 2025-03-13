var moveZeroes = function(nums) {
  const n = nums.length;
  let j = 0;
  for (let i = 0; i < n; i++) {
      if (nums[i] != 0) {
          swap(nums, i ,j);
          j++;
      }
  }

  return nums;
};

const swap = (arr, i , j) => {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

console.log(moveZeroes([0,1,0,3,12]));