//! Question
//Given a string s consisting of words and spaces, return the length of the last word in the string.

//! Solution

var lengthOfLastWord = function(s) {
    let length = 0;
    let i = s.length - 1;

    while (i >= 0) {
        if (s[i] != " ") {
            while (i >= 0 && s[i] != " ") {
                length++;
                i--;
            }
            return length;
        }
        i--;
    }
};

let str 
= "luffy is still joyboy";
let l = lengthOfLastWord(str);
console.log(l);