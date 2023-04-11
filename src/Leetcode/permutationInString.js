//! Question

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

//! Solution 

var checkInclusion = function(s1, s2) {
    let arr = permutions(s1);

    for (let i = 0; i < arr.length; i++) {
        if (s2.includes(arr[i])) return true;
    }

    return false;
};

var permutions = function(s) {
    if (!s || typeof(s) !== "string") {
        return "Please enter a string";
    } else if (!!s.length && s.length < 2) {
        return s;
    }

    let arr = [];

    for (let i = 0; i < s.length; i++) {
        let char = s[i];

        if (s.indexOf(char) != i) continue;

        let remainingChars = s.slice(0, i) + s.slice(i + 1, s.length);

        for (let permutation of permutions(remainingChars)) {
            arr.push(char + permutation);
        }
    }

    return arr;
}

let s1 = "ab";
let s2 = "ceibaooo"
let ans = checkInclusion(s1, s2);
console.log(ans);

// console.log(permutions("aabc"));