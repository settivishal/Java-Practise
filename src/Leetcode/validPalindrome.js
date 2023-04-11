//! Question


//! Solution 1 (My own solution)
s = "ab_a";

let str = s.replace(/[^\w]|_/g, '').toLowerCase(); // or s.replace(/\W+/g, '') also works
console.log(str);

let n = str.length;
let i = 0;

for (i = 0; i < n; i++){
    if (!(str[i] === str[n - i - 1])) {
        break;
    }
}
console.log(i === n);

//! Solution 2
let start = 0;
let end = s.length - 1;

while (start < end) {
    if (s[start] !== s[end]) return false;
    start++;
    end--;
}

return true;