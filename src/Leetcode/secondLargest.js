//! Question


//! solution
var secondLargest = (A) => {
  if (A.length < 2) return -1;

  let max1 = A[0]
  let max2 = A[0]

  for (let i = 1; i< A.length; i++) {
      if (A[i] > max1) {
          max2 = max1;
          max1 = A[i];
      } else if (A[i] < max1 && A[i] > max2) {
          max2 = A[i];
      }
      // console.log(max1)
  }

  return max2;
}

const A = [13,7,16,18,14,17,18,8,10];
console.log(secondLargest(A));