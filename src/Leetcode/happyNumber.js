//! Question
// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// 1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
// 2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// 3. Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

//! Solution

var isHappy = function(n) {
    if(n<10){
        if(n === 1 || n === 7){
            return true
        }
        return false
    }
    let total = 0
    while(n>0){
        let sq = n % 10
        total += sq**2
        n -= sq
        n /= 10
    }
    if(total === 1){
        return true
    }
    return isHappy(total)
};

let num = isHappy(7);
console.log(num);