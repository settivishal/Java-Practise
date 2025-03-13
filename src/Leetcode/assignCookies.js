//! Question
// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

//! Solution
var findContentChildren = function(g, s) {
    g = g.sort((a,b) => a-b);
    s = s.sort((a,b) => a-b);

    let i = 0; 
    let j = 0; 
    let count = 0;

    while (i < s.length) {
        if (s[i] >= g[j]) {
            count++;
            j++;
        }
        i++;
    }

    return count;
};

const g = [10,9,8,7];
const s = [5,6,7,8];
console.log(findContentChildren(g, s));