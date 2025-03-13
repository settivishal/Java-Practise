var gcdOfStrings = function(str1, str2) {
  if (str1+str2 !== str2+str1) return "";

    let n = str1.length; k = str2.length;

    let gcd = (x, y) => {
        if (!y) return x;
        return gcd(y, x%y);
    }

    let div = gcd(n, k);

    return str1.slice(0, div);
};

console.log(gcdOfStrings("ABCABC", "ABC"));