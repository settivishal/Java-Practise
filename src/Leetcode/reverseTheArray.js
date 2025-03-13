//! Question
// You are given a constant array A.

// You are required to return another array which is the reversed form of the input array.

//! Solution

const reverseArray = (A) => {
    let reverseArr = [];
    for (let i = 0; i < A.length; i++) {
      reverseArr.push(A[A.length - 1 - i])
    }

    return reverseArr;
}

// console.log(reverseArray([1,2,3,4,5]));
console.log(reverseArray([1,1,10,9]));
// console.log(reverseArray([46,5,98,77,9,53,53,94,97,29,92,39,12,57,60,73,16,31,98,89]));