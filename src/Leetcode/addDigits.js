//! Question


//! Solution 1

var addDigits1 = function(num) {
    if (num >= 0 && num <= 9) return num;

    let result = 0;
    while(num > 0) {
        result += num%10;
        num = Math.floor(num/10);
    }
    return addDigits(result);
};

//! Solution 2
//* using Digital Root concept

var addDigits2 = function(num) {
    if (isNaN(num) || num === 0) return 0;
    if (num < 10) return num;

    return num%9 === 0 ? 9 : num%9;
};

let num = 25;
let ans = addDigits2(num);
console.log(ans);