var productExceptSelf = function(nums) {
  let ans = []; prod = 1;
  for (let num of nums) {
      prod = 1;
      for (let i = 0; i < nums.length; i++) {
          if (!(num == nums[i])) prod *= nums[i];
      }
      ans.push(prod);
  }

  return ans;
};

console.log(productExceptSelf([1,2,3,4]))