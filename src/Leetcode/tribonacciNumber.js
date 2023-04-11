//! Question
// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.

//! Solution 1
var tribonacciRecursion = function(n) {
    if (arr[n] !== undefined) return arr[n];

    for (let i = 3; i <= n; i++) {
        arr[i] = tribonacciRecursion(i-1) + tribonacciRecursion(i-2) + tribonacciRecursion(i-3);
    }

    return arr[n];
};

//! Solution 2
var tribonacciIterative = function(n) {
    if (arr[n] !== undefined) return arr[n];

    for (let i = 0; i <= n-3; i++) {
        arr[i+3] = arr[i] + arr[i+1] + arr[i+2];
    }

    return arr[n];
};

arr = [0,1,1];

var n1 = tribonacciRecursion(10);
var n2 = tribonacciIterative(10);
console.log(n1, n2);