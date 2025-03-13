//! Question
// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...

//! Solution
var convertToTitle = function(n) {
  if (n <= 26) {
      return String.fromCharCode(n + 64);
  }

  let string = "";

  while (n > 0) {
      let r = n%26;
      r = r == 0 ? 26 : r;

      string = String.fromCharCode(r + 64) + string;

      n = n - r;
      n = n/26;
  }

  return string;
};

console.log(convertToTitle(701));