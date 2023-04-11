//! Question


//! Solution

var reverseBits = function(n) {
    console.log(Number.parseInt(n.toString(2).split("").reverse().join("").padEnd(32, "0"), 2));
};

let n = 00000010100101000001111010011100;
// console.log(reverseBits(n));
reverseBits(n)