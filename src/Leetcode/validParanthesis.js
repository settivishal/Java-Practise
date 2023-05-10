//! Question
/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */

//! Solution

// let s = "()[]{}";
let s = "(]";

function validParanthesis(s) {
    let stack = [];

    for (let i = 0; i < s.length; i++) 
    {
        let x = s[i];
    
        if (x == '(' || x == '{' || x == '[') {
            stack.push(x);
            continue;
        }

        if (stack.length == 0) return false;
    
        let check;
        switch(x){
        case ')':
            check = stack.pop();
            if (check == '{' || check == '[') 
                return false;
            break;
    
        case '}':
            check = stack.pop();
            if (check == '(' || check == '[') 
                return false;
            break;
    
        case ']':
            check = stack.pop();
            if (check == '(' || check == '{') 
                return false;
            break;
        }
    }
    
    return (stack.length == 0);
}

console.log(validParanthesis(s));

console.log("Testing");