//! Question


//! Solution

var isAnagram = function(s, t) {
    if (!s.length || !t.length || s.length !== t.length) return false;

    return s.split("").sort().join("") === t.split("").sort().join("")
};

let s = "accc";
let t = "ccac";
let ans = isAnagram(s, t);
console.log(ans);