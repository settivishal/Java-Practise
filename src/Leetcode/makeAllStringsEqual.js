//! Question
// You are given an array of strings words (0-indexed).

// In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

// Return true if you can make every string in words equal using any number of operations, and false otherwise.

//! Solution

var makeEqual = function(words) {
    let charFreq = {};

    words.forEach(word => {
      // console.log(word.split(""));

      let wordArr = word.split("");
      wordArr.forEach(e => {
        charFreq[e] ? charFreq[e]++ : charFreq[e] = 1;
      })
    });

    console.log(charFreq);
    console.log(Object.values(charFreq));
    let arr = Object.values(charFreq);
    // console.log(arr.every(v => v == arr[0]));
    return arr.every(v => v == arr[0]);
};

console.log(makeEqual(["abc","aabc","bc"]));
console.log(makeEqual(["ab","a"]));
console.log(makeEqual(["caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"]));